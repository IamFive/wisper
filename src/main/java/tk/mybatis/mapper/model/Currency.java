package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.currency")
public class Currency {
    /**
     * 币种缩写
     */
    @Id
    private String abbr;

    /**
     * 币种名称
     */
    private String name;

    /**
     * 币种符号
     */
    private String symbol;

    /**
     * 获取币种缩写
     *
     * @return abbr - 币种缩写
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * 设置币种缩写
     *
     * @param abbr 币种缩写
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    /**
     * 获取币种名称
     *
     * @return name - 币种名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置币种名称
     *
     * @param name 币种名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取币种符号
     *
     * @return symbol - 币种符号
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 设置币种符号
     *
     * @param symbol 币种符号
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}