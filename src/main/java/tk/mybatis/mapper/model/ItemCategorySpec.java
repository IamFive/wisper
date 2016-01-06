package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.item_category_spec")
public class ItemCategorySpec {
    /**
     * pk
     */
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    @Column(name = "item_category_id")
    private Integer itemCategoryId;

    /**
     * 规格名称
     */
    private String name;

    /**
     * 规格选项列表
     */
    private Object specifications;

    /**
     * 获取pk
     *
     * @return id - pk
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置pk
     *
     * @param id pk
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return item_category_id
     */
    public Integer getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * @param itemCategoryId
     */
    public void setItemCategoryId(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    /**
     * 获取规格名称
     *
     * @return name - 规格名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置规格名称
     *
     * @param name 规格名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取规格选项列表
     *
     * @return specifications - 规格选项列表
     */
    public Object getSpecifications() {
        return specifications;
    }

    /**
     * 设置规格选项列表
     *
     * @param specifications 规格选项列表
     */
    public void setSpecifications(Object specifications) {
        this.specifications = specifications;
    }
}