package kr.inhatc.spring.item.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "my_item")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long id; 				 // 상품 코드
	
	@Column(nullable = false, length = 50)
	private String itemNm;			// 상품 이름
	
	@Column(nullable = false)
	private int price; 				// 상품 가격
	
	@Column(nullable = false, name = "number")
	private int stockNumber;		// 재고 수량
	
	private String itemDetail;		// 상품 상세 설명
	
	private LocalDateTime regTime;  // 등록 시간
	
	private LocalDateTime updateTime; //수정 시간 
	
	
}
