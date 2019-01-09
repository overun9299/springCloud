package entity;

import java.util.List;

/**
 * 封装分页返回数据
 * Created by ZhangPY on 2018/12/30
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 */
public class PageResult<T> {

    private long tltal;

    private List<T> rows;

    public long getTltal() {
        return tltal;
    }

    public void setTltal(long tltal) {
        this.tltal = tltal;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageResult() {
    }

    public PageResult(long tltal, List<T> rows) {
        this.tltal = tltal;
        this.rows = rows;
    }
}
