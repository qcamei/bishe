package cn.lyf.hotelserver.dao;

import cn.lyf.hotelserver.entity.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @Title:  HotelDao
 * @Param:  * @param null
 * @Description: hotelDao层接口
 * @author: DIC.sweetlfy
 * @date: 2018/11/19 9:43
 * @version: V1.0
 */
@Repository
public interface HotelDao {
    /**
     * 通过房间号查询
     * @param hotelId
     * @return
     */
    Hotel getHotelByHotelId(String hotelId);
    /**
     *  查询所有房间信息
     * @return
     */
    List<Hotel> findAllHotels();
    /**
     * 通过UserName查询该用户的房间
     * @param userName
     * @return
     */
    List<Hotel> getHotelByUserName(String userName);
    /**
     * 增加房间
     * @param hotel
     * @return
     */
    int addHotel(Hotel hotel);
    /**
     * 更新房间信息
     * @param hotel
     * @return
     */
    int updateHotel(Hotel hotel);
}
