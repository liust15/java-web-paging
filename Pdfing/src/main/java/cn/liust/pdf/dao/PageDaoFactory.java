package cn.liust.pdf.dao;

public class PageDaoFactory {
    public static PageDaoFactory INSTANCE;

    static {
        INSTANCE = new PageDaoFactory();
    }

    private PageDaoFactory() {
        super();
    }

    public String getPageData(int pageindex, int row) {
        return new MainDao().getPageData(pageindex, row);
    }

}
