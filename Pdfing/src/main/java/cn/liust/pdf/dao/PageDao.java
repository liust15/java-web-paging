package cn.liust.pdf.dao;


import cn.liust.pdf.bean.Page;

public class PageDao {
    public static String getPageData(String pagenum, String pagesize) {
        int totalrecord  = MainDaoFactory.getTotalrecord();
        System.out.println(pagenum+"+"+pagesize+"+"+totalrecord);
        int row =Integer.parseInt(pagesize);
        int pages ;
        if(pagenum == null){
            pages = 1;
        }else{
            pages = Integer.parseInt(pagenum);
        }
        int pageindex = (pages-1)*row;
        System.out.println(pageindex+"+"+row);
        Page page =new Page(totalrecord,row,pages);
        String data = MainDaoFactory.getPageData(pageindex,row);

        return data;
    }
}
