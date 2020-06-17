package top.zwzx.dao;

import org.apache.ibatis.annotations.Param;
import top.zwzx.pojo.Books;

import java.util.List;

/**
 * @author zx
 * @date 2020/5/26
 **/
public interface BookMapper {
//    增加一本书
    int addBook(Books books);
//    删除一本书
    int deleteBook(@Param("bookID")int id);
//    更新一本书
    int updateBook(Books books);
//    查询一本书
    Books queryBookById(@Param("bookID") int id);
//    查询全部书
    List<Books> queryAllBook();
//
List<Books> queryBookByName(@Param("bookName") String bookName);

}
