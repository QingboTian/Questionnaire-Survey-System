package com.tqb.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.omg.CORBA.UserException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * <p>Title: QuesException.java</p>
 * <p>Description: 
 * 全局异常处理器，将所有的异常信息保存到日志文件当中
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月15日上午10:43:51
 * @version 1.0
 *
 */
public class QuesException implements HandlerExceptionResolver {

	//获取日志记录器Logger，名字为本类类名
    private static Logger log = Logger.getLogger(QuesException.class);
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		if (ex instanceof UserException)
			log.warn("自定义异常UserException" + ex.getMessage());
		else{
			log.error(ex.getMessage());
			log.error(ex.getStackTrace());
			log.error(ex.getSuppressed());
		}
		
		return new ModelAndView();
	}

}
