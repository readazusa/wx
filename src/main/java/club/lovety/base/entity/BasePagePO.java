package club.lovety.base.entity;

import java.util.List;

/**
 * Created by smc on 2016/1/12.
 */
public class BasePagePO<T> {

    private int draw;

    private int recordsTotal;

    private int recordsFiltered;

    private int totalPage;  //总共多少页

    private int pageSize;

    private List<T> data;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotalPage() {
        int middleNumPage = 0;
        if(recordsTotal !=0){
            if(recordsTotal % pageSize ==0){
                middleNumPage = recordsTotal/pageSize;
            }else{
                middleNumPage = recordsTotal/pageSize+1;
            }
        }
        return middleNumPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
