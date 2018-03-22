package poc.rest.api.controller.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class DateTimeUtils {

	public static final String _TIMESTAMP = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public static final String _NORMAL_PARTTERN = "dd/MM/yyyy HH:mm:ss";

	public static String convertDateToString(Date date) {
		return convertDateToString(date, _NORMAL_PARTTERN);
	}

	public static String convertDateToString(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		if (Validator.isNull(date) || Validator.isNull(pattern)) {
			return StringPool.BLANK;
		}

		return sdf.format(date);
	}

	public static Date convertStringToDate(String source, String pattern) {
		
		if (Validator.isNull(source) || Validator.isNull(pattern)) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		try {
			return sdf.parse(source);
		} catch (Exception e) {
			return null;
		}
		
	}
}
