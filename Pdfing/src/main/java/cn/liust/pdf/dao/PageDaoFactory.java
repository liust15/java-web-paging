package cn.liust.pdf.dao;

import java.util.List;

public class PageDaoFactory {
    public static PageDaoFactory INSTANCE;

    static {
        INSTANCE = new PageDaoFactory();
    }

    private PageDaoFactory() {
        super();
    }

    public String getPageData(int pageindex, int row) {
        return new PageDao().getPageData(pageindex, row);
    }

}
