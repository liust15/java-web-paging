package cn.liust.pdf.dao;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import cn.liust.pdf.bean.Page;

public class PageDao {
    public static String getPageData(int pagenum, int pagesize) {
        ObjectMapper mapper = new ObjectMapper();
       String data;
        int totalrecord  = MainDaoFactory.getTotalrecord();
        System.out.println(pagenum+"+"+pagesize+"+"+totalrecord);
        int pages ;
        if(pagenum == 0){
            pages = 1;
        }else{
            pages =pagenum;
        }
        int pageindex = (pages-1)*pagesize;
        System.out.println(pageindex+"+"+pagesize);
        Page page =new Page(totalrecord,pagesize,pages);
        List list = MainDaoFactory.getPageData(pageindex,pagesize);
        page.setList(list);
        try {
            data = mapper.writeValueAsString(page);
        } catch (JsonProcessingException e) {
            data = "";
        }
        return data;
    }
}
