package cn.liust.pdf.dao;

import java.util.List;

public class MainDaoFactory {
    public static MainDaoFactory INSTANCE;

    static {
        INSTANCE = new MainDaoFactory();
    }

    private MainDaoFactory() {
        super();
    }

    public String getAlldata() {
        return new MainDao().getAlldata();
    }

    public static int getTotalrecord() {
        return new MainDao().getTotalrecord();
    }

    public static List getPageData(int pageindex, int row) {
        return new MainDao().getPageData(pageindex, row);
    }
}
