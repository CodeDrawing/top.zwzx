package top.zwzx.service;

import org.apache.ibatis.annotations.Param;
import top.zwzx.pojo.Books;

import java.util.List;

/**
 * @author zx
 * @date 2020/5/26
 **/
public interface IBookService {
    //    增加一本书
    int addBook(Books books);
    //    删除一本书
    int deleteBook(int id);
    //    更新一本书
    int updateBook(Books books);
    //    查询一本书
    Books queryBookById(int id);
    //    查询全部书
    List<Books> queryAllBook();
//
    List<Books> queryBookByName( String bookName);
}
