package top.zwzx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zwzx.pojo.Books;
import top.zwzx.service.BookServiceImpl;
import top.zwzx.service.IBookService;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2020/5/26
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private IBookService bookService;

    //查询全部的数据，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allbook";
    }
//    跳转到增加书籍页面
@RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

//    增加书籍
    @RequestMapping("addBook")
    public String addBook(Books books){
        System.out.println("addBook->"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
//    跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Books",books);
        return "updateBook";
    }
//    修改书籍
@RequestMapping("/updateBook")
    public String updateBook(Books book){
    System.out.println("updateBook->"+book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }
//    删除书籍
@RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
    bookService.deleteBook(id);
    return "redirect:/book/allBook";
    }
//    查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        List<Books> list = bookService.queryBookByName(queryBookName);
            if(list.size()==0){
                model.addAttribute("error","未查到");
                return "allbook";
            }
        model.addAttribute("list",list);
        return "allbook";
    }

}
