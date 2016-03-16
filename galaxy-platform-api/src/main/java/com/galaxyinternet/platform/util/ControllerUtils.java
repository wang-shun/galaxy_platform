package com.galaxyinternet.platform.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.galaxyinternet.platform.constant.PlatformConst;

public class ControllerUtils {

	/**
	 * 
	 * @Description:消息提醒临时传参方法
	 * @param request
	 * @param projectName
	 *            项目名称
	 * @param projectId
	 *            项目id
	 *
	 */
	public static void setRequestParamsForMessageTip(HttpServletRequest request, String projectName, Long projectId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(PlatformConst.REQUEST_SCOPE_PROJECT_NAME, projectName);
		params.put(PlatformConst.REQUEST_SCOPE_PROJECT_ID, projectId);
		request.setAttribute(PlatformConst.REQUEST_SCOPE_MESSAGE_TIP, params);
	}
}