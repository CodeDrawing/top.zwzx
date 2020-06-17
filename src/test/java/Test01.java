import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zwzx.pojo.Books;
import top.zwzx.service.IBookService;


/**
 * @author zx
 * @date 2020/5/27
 **/

public class Test01 {
    @Test
    public void run01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IBookService bookService=(IBookService) context.getBean("BookServiceImpl");
        for(Books books:bookService.queryAllBook()){
            System.out.println(books);
        }
    }
    @Test
    public void run02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IBookService bookService=(IBookService) context.getBean("BookServiceImpl");
        Books book = bookService.queryBookById(2);
        System.out.println(book);
    }
    @Test
    public void  run03(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IBookService bookService=(IBookService)context.getBean("BookServiceImpl");
        bookService.deleteBook(1);
    }

}
