package kr.or.ddit.study06.sec06;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class ValueObject {
	private String field1;
	@Setter
	private int field2;
	
}
