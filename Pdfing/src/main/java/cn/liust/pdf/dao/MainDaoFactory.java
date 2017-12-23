package cn.liust.pdf.dao;

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

    public static String getPageData(int pageindex, int row) {
        return new MainDao().getPageData(pageindex, row);
    }
}
