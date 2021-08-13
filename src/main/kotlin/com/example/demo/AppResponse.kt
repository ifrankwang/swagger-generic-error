package com.example.demo

/**
 * @author Frank Wang
 */
data class AppResponse<T>(
  /**
   * 错误代码
   */
  var code: Int = 0,
  /**
   * 成功标志
   */
  var success: Boolean = true,
  /**
   * 错误信息
   */
  var message: String = "success",
  /**
   * 返回数据
   */
  var data: T? = null,
)
