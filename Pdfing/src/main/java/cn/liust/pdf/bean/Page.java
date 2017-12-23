package cn.liust.pdf.bean;

import java.util.List;

public class Page {

    private List list;//存放数据
    private int totalpage;//记住总页数
    private int totalrecord; //总记录数
    private int pagesize;
    private int pagenum;//代表用户想看的页码
    private int startpage; //开始页
    private int endpage; //结束页

    //用来计算总页数
    public Page(int totalrecord, int pagesize, int pagenum) {
        this.pagesize = pagesize;
        this.totalrecord = totalrecord;
        this.pagenum = pagenum;
        if (this.totalrecord % this.pagesize == 0) {
            this.totalpage = this.totalrecord / this.pagesize;
        } else {
            this.totalpage = this.totalrecord / this.pagesize + 1;
        }
        if (this.pagenum - 2 <= 0) {
            this.startpage = 1;
        } else {
            this.startpage = this.pagenum - 2;
        }
        if (this.pagenum + 2 > this.totalpage) {

            this.endpage = this.totalpage;
        } else {

            this.endpage = this.pagenum + 2;
        }
    }


    public int getStartpage() {
        return startpage;
    }


    public void setStartpage(int startpage) {
        this.startpage = startpage;
    }


    public int getEndpage() {
        return endpage;
    }


    public void setEndpage(int endpage) {
        this.endpage = endpage;
    }


    public List getList() {
        return list;
    }
    public void setList(List list) {
        this.list = list;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getTotalrecord() {
        return totalrecord;
    }

    public void setTotalrecord(int totalrecord) {
        this.totalrecord = totalrecord;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }
}
