package jpastudy.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Category {
    @Id @GeneratedValue
    @Column(name="catergory_id")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name="category_item", // 중간 테이블 연결
          joinColumns = @JoinColumn(name = "catergory_id"), // 중간 테이블의 catergory_id
          inverseJoinColumns = @JoinColumn(name="item_id") // 중간 테이블의 item_id
    )
//    실무에서는 사용x
    private List<Item> items = new ArrayList<>();

    // 셀프로 양방향
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    //== 연관관계 메서드 ==//
    public void addChildCategory(Category child) {
        this.child.add(child);
        child.setParent(this);
    }
}
