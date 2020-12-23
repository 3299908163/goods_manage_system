package cn.wares.commodity.entity;


/**
 * 角色表
 */
public class Role {
    /** 角色id */
    private Integer id;
    /** 角色名（客户/管理员） */
    private String roleName;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return this.roleName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        Role that = (Role) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ",roleName='" + roleName + "'" +
                '}';
    }

}