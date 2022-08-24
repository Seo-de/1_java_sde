package edu.kh.exception.model.vo;

import java.io.IOException;

public class Child extends Parent{
	
	@Override
	public void method() throws IOException{
		
		// IOException -> Exception : 변경 불가
		// 왜? Exception이 더 넓은(많은) 예외 처리가 가능
		
		// IOException -> EOException : 변경 가능
		// 왜? EOException이 더 좁은(구체적인) 예외 처리이기 때문에 가능
		
	}
	
	

}
