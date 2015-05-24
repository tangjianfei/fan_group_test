package com.fg.comm;

/**
 * 自定义异常类
 * 定义所有接口调用时发生异常的编号
 * 变量名称规则：EXP（Exception简写）  ZJS（宅急送简写）	CREATE（创建订单接口）  BEFOUR（调用接口前异常）  NULL（null值异常）
 * 变量值编号规则： 8位整数编号
 * 			      前两位为 客户编号 
 * 			  3、4位为接口编号 
 * 			  5、6为调用前\后异常标识（调用接口前异常为01 调用接口后异常为02）
 * 			  7、8为异常类型编号（01空异常、02类型转换、03格式不符）
 * @author Administrator
 *
 */
public class CommException {
	
	/***************************** 宅急送接口开始  	宅急送编号11 *****************************/
	
	/***创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_ZJS_CREATE_BEFOUR_NULL = 11010101;
	//参数类型异常
	public static final int EXP_ZJS_CREATE_BEFOUR_TYPE = 11010102;
	//参数格式异常
	public static final int EXP_ZJS_CREATE_BEFOUR_STANDARD = 11010103;
	
	/***取消订单接口编号02***/
	//参数NUll或''异常
	public static final int EXP_ZJS_CANCEL_BEFOUR_NULL = 11020101;
	//参数类型异常
	public static final int EXP_ZJS_CANCEL_BEFOUR_TYPE = 11020102;
	//参数格式异常
	public static final int EXP_ZJS_CANCEL_BEFOUR_STANDARD = 11020103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_ZJS_QUERY_BEFOUR_NULL = 11030101;
	//参数类型异常
	public static final int EXP_ZJS_QUERY_BEFOUR_TYPE = 11030102;
	//参数格式异常
	public static final int EXP_ZJS_QUERY_BEFOUR_STANDARD = 11030103;
		
		
	/***电子面单接口编号04***/
	//参数NUll或''异常
	public static final int EXP_ZJS_SURFACE_BEFOUR_NULL = 11040101;
	//参数类型异常
	public static final int EXP_ZJS_SURFACE_BEFOUR_TYPE = 11040102;
	//参数格式异常
	public static final int EXP_ZJS_SURFACE_BEFOUR_STANDARD = 11040103;
	
	
	/***价格查询接口编号05***/
	//参数NUll或''异常
	public static final int EXP_ZJS_PRICE_BEFOUR_NULL = 11050101;
	//参数类型异常
	public static final int EXP_ZJS_PRICE_BEFOUR_TYPE = 11050102;
	//参数格式异常
	public static final int EXP_ZJS_PRICE_BEFOUR_STANDARD = 11050103;
	
	/***************************** 宅急送接口结束  *****************************/

	

	/***************************** 优速接口开始  	优速编号12 *****************************/
	
	/***创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_UC_CREATE_BEFOUR_NULL = 12010101;
	//参数类型异常
	public static final int EXP_UC_CREATE_BEFOUR_TYPE = 12010102;
	//参数格式异常
	public static final int EXP_UC_CREATE_BEFOUR_STANDARD = 12010103;
	
	/***取消订单接口编号02***/
	//参数NUll或''异常
	public static final int EXP_UC_CANCEL_BEFOUR_NULL = 12020101;
	//参数类型异常
	public static final int EXP_UC_CANCEL_BEFOUR_TYPE = 12020102;
	//参数格式异常
	public static final int EXP_UC_CANCEL_BEFOUR_STANDARD = 12020103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_UC_QUERY_BEFOUR_NULL = 12030101;
	//参数类型异常
	public static final int EXP_UC_QUERY_BEFOUR_TYPE = 12030102;
	//参数格式异常
	public static final int EXP_UC_QUERY_BEFOUR_STANDARD = 12030103;
		
		
	/***电子面单接口编号04***/
	//参数NUll或''异常
	public static final int EXP_UC_SURFACE_BEFOUR_NULL = 12040101;
	//参数类型异常
	public static final int EXP_UC_SURFACE_BEFOUR_TYPE = 12040102;
	//参数格式异常
	public static final int EXP_UC_SURFACE_BEFOUR_STANDARD = 12040103;
	
	
	/***价格查询接口编号05***/
	//参数NUll或''异常
	public static final int EXP_UC_PRICE_BEFOUR_NULL = 12050101;
	//参数类型异常
	public static final int EXP_UC_PRICE_BEFOUR_TYPE = 12050102;
	//参数格式异常
	public static final int EXP_UC_PRICE_BEFOUR_STANDARD = 12050103;
	
	
	/***添加物流信息接口编号06***/
	//参数NUll或''异常
	public static final int EXP_UC_ADDLOGISTICS_BEFOUR_NULL = 12060101;
	//参数类型异常
	public static final int EXP_UCADDLOGISTICS_BEFOUR_TYPE = 12060102;
	//参数格式异常
	public static final int EXP_UC_ADDLOGISTICS_BEFOUR_STANDARD = 12060103;
	
	/***************************** 优速接口结束  *****************************/
	
	
	
	/***************************** 全峰接口开始  	全峰编号13 *****************************/
		
	/***全峰创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_QF_CREATE_BEFOUR_NULL = 13010101;
	//参数类型异常
	public static final int EXP_QF_CREATE_BEFOUR_TYPE = 13010102;
	//参数格式异常
	public static final int EXP_QF_CREATE_BEFOUR_STANDARD = 13010103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_QF_QUERY_BEFOUR_NULL = 13030101;
	//参数类型异常
	public static final int EXP_QF_QUERY_BEFOUR_TYPE = 13030102;
	//参数格式异常
	public static final int EXP_QF_QUERY_BEFOUR_STANDARD = 13030103;
	
	/***************************** 全峰接口开始  *****************************/

	

	/***************************** 百世汇通接口开始  	百世汇通编号14 *****************************/
	
	/***创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_BEST_CREATE_BEFOUR_NULL = 14010101;
	//参数类型异常
	public static final int EXP_BEST_CREATE_BEFOUR_TYPE = 14010102;
	//参数格式异常
	public static final int EXP_BEST_CREATE_BEFOUR_STANDARD = 14010103;
	
	/***取消订单接口编号02***/
	//参数NUll或''异常
	public static final int EXP_BEST_CANCEL_BEFOUR_NULL = 14020101;
	//参数类型异常
	public static final int EXP_BEST_CANCEL_BEFOUR_TYPE = 14020102;
	//参数格式异常
	public static final int EXP_BEST_CANCEL_BEFOUR_STANDARD = 14020103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_BEST_QUERY_BEFOUR_NULL = 14030101;
	//参数类型异常
	public static final int EXP_BEST_QUERY_BEFOUR_TYPE = 14030102;
	//参数格式异常
	public static final int EXP_BEST_QUERY_BEFOUR_STANDARD = 14030103;
		
	/***************************** 百世汇通接口结束  *****************************/

	

	/***************************** 圆通接口开始  	圆通编号15 *****************************/
	
	/***创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_YTO_CREATE_BEFOUR_NULL = 15010101;
	//参数类型异常
	public static final int EXP_YTO_CREATE_BEFOUR_TYPE = 15010102;
	//参数格式异常
	public static final int EXP_YTO_CREATE_BEFOUR_STANDARD = 15010103;
	
	/***取消订单接口编号02***/
	//参数NUll或''异常
	public static final int EXP_YTO_CANCEL_BEFOUR_NULL = 15020101;
	//参数类型异常
	public static final int EXP_YTO_CANCEL_BEFOUR_TYPE = 15020102;
	//参数格式异常
	public static final int EXP_YTO_CANCEL_BEFOUR_STANDARD = 15020103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_YTO_QUERY_BEFOUR_NULL = 15030101;
	//参数类型异常
	public static final int EXP_YTO_QUERY_BEFOUR_TYPE = 15030102;
	//参数格式异常
	public static final int EXP_YTO_QUERY_BEFOUR_STANDARD = 15030103;
		
		
	/***电子面单接口编号04***/
	//参数NUll或''异常
	public static final int EXP_YTO_SURFACE_BEFOUR_NULL = 15040101;
	//参数类型异常
	public static final int EXP_YTO_SURFACE_BEFOUR_TYPE = 15040102;
	//参数格式异常
	public static final int EXP_YTO_SURFACE_BEFOUR_STANDARD = 15040103;
	
	
	/***价格查询接口编号05***/
	//参数NUll或''异常
	public static final int EXP_YTO_PRICE_BEFOUR_NULL = 15050101;
	//参数类型异常
	public static final int EXP_YTO_PRICE_BEFOUR_TYPE = 15050102;
	//参数格式异常
	public static final int EXP_YTO_PRICE_BEFOUR_STANDARD = 15050103;
	
	
	/***根据省查询市接口编号06***/
	//参数NUll或''异常
	public static final int EXP_YTO_PROV_BEFOUR_NULL = 15060101;
	//参数类型异常
	public static final int EXP_YTO_PROV_BEFOUR_TYPE = 15060102;
	//参数格式异常
	public static final int EXP_YTO_PROV_BEFOUR_STANDARD = 15060103;
	
	
	/***市下属网点查询接口编号07***/
	//参数NUll或''异常
	public static final int EXP_YTO_CITY_BEFOUR_NULL = 15070101;
	//参数类型异常
	public static final int EXP_YTO_CITY_BEFOUR_TYPE = 15070102;
	//参数格式异常
	public static final int EXP_YTO_CITY_BEFOUR_STANDARD = 15070103;
	
	
	/***查询网点服务信息接口(编号)编号08***/
	//参数NUll或''异常
	public static final int EXP_YTO_STATION_BEFOUR_NULL = 15080101;
	//参数类型异常
	public static final int EXP_YTO_STATION_BEFOUR_TYPE = 15080102;
	//参数格式异常
	public static final int EXP_YTO_STATION_BEFOUR_STANDARD = 15080103;
	
	/***************************** 圆通接口结束  *****************************/

	

	/***************************** 移动接口开始  	移动编号16 *****************************/
	
	/***移动平台成员批量开通申请接口 01***/
	//参数NUll或''异常
	public static final int EXP_ADC_MEMBER_NULL = 16010101;
	//参数类型异常
	public static final int EXP_ADC_MEMBER_TYPE = 16010102;
	//参数格式异常
	public static final int EXP_ADC_MEMBER_STANDARD = 16010103;
	
	/***客户套餐查询接口 02***/
	//参数NUll或''异常
	public static final int EXP_ADC_FLOWQUERY_NULL = 16020101;
	//参数类型异常
	public static final int EXP_ADC_FLOWQUERY_TYPE = 16020102;
	//参数格式异常
	public static final int EXP_ADC_FLOWQUERY_STANDARD = 16020103;
	
	/***成员批量文件开通处理结果查询接口 03***/
	//参数NUll或''异常
	public static final int EXP_ADC_HAND_NULL = 16030101;
	//参数类型异常
	public static final int EXP_ADC_HAND_TYPE = 16030102;
	//参数格式异常
	public static final int EXP_ADC_HAND_STANDARD = 16030103;
	
	/***统一剩余资源明细查询接口 04***/
	//参数NUll或''异常
	public static final int EXP_ADC_FLOWSERACH_NULL = 16040101;
	//参数类型异常
	public static final int EXP_ADC_FLOWSERACH_TYPE = 16040102;
	//参数格式异常
	public static final int EXP_ADC_FLOWSERACH_STANDARD = 16040103;
	
	/***查询手机流量清单功能接口 05***/
	//参数NUll或''异常
	public static final int EXP_ADC_MOBILE_NULL = 16050101;
	//参数类型异常
	public static final int EXP_ADC_MOBILE_TYPE = 16050102;
	//参数格式异常
	public static final int EXP_ADC_MOBILE_STANDARD = 16050103;
	
	/***成员订购关系对账查询接口 06***/
	//参数NUll或''异常
	public static final int EXP_ADC_MEMBERBILL_NULL = 16060101;
	//参数类型异常
	public static final int EXP_ADC_MEMBERBILL_TYPE = 16060102;
	//参数格式异常
	public static final int EXP_ADC_MEMBERBILL_STANDARD = 16060103;
	
	/***集团订购关系查询 07***/
	//参数NUll或''异常
	public static final int EXP_ADC_ECORDER_NULL = 16060101;
	//参数类型异常
	public static final int EXP_ADC_ECORDER_TYPE = 16060102;
	//参数格式异常
	public static final int EXP_ADC_ECORDER_STANDARD = 16060103;
	
	/***************************** 移动接口结束  *****************************/
	
	/***************************** 中通接口开始  	中通编号17 *****************************/
	
	/***创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_ZTO_CREATE_BEFOUR_NULL = 17010101;
	//参数类型异常
	public static final int EXP_ZTO_CREATE_BEFOUR_TYPE = 17010102;
	//参数格式异常
	public static final int EXP_ZTO_CREATE_BEFOUR_STANDARD = 17010103;
	
	/***取消订单接口编号02***/
	//参数NUll或''异常
	public static final int EXP_ZTO_CANCEL_BEFOUR_NULL = 17020101;
	//参数类型异常
	public static final int EXP_ZTO_CANCEL_BEFOUR_TYPE = 17020102;
	//参数格式异常
	public static final int EXP_ZTO_CANCEL_BEFOUR_STANDARD = 17020103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_ZTO_QUERY_BEFOUR_NULL = 17030101;
	//参数类型异常
	public static final int EXP_ZTO_QUERY_BEFOUR_TYPE = 17030102;
	//参数格式异常
	public static final int EXP_ZTO_QUERY_BEFOUR_STANDARD = 17030103;
	
	
	/***大头笔04***/
	//参数NUll或''异常
	public static final int EXP_ZTO_MARKE_BEFOUR_NULL = 17040101;
	//参数类型异常
	public static final int EXP_ZTO_MARKE_BEFOUR_TYPE = 17040102;
	//参数格式异常
	public static final int EXP_ZTO_MARKE_BEFOUR_STANDARD = 17040103;
		
	/***************************** 中通接口结束  *****************************/
	
	/***************************** 德邦接口开始  	中通编号18 *****************************/
	
	/***创单接口 01***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_CREATE_BEFOUR_NULL = 18010101;
	//参数类型异常
	public static final int EXP_DEBANG_CREATE_BEFOUR_TYPE = 18010102;
	//参数格式异常
	public static final int EXP_DEBANG_CREATE_BEFOUR_STANDARD = 18010103;
	
	/***取消订单接口编号02***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_CANCEL_BEFOUR_NULL = 18020101;
	//参数类型异常
	public static final int EXP_DEBANG_CANCEL_BEFOUR_TYPE = 18020102;
	//参数格式异常
	public static final int EXP_DEBANG_CANCEL_BEFOUR_STANDARD = 18020103;
	
	
	/***查询订单接口编号03***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_QUERY_BEFOUR_NULL = 18030101;
	//参数类型异常
	public static final int EXP_DEBANG_QUERY_BEFOUR_TYPE = 18030102;
	//参数格式异常
	public static final int EXP_DEBANG_QUERY_BEFOUR_STANDARD = 18030103;
	
	
	/***价格查询接口编号04***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_PRICE_BEFOUR_NULL = 18040101;
	//参数类型异常
	public static final int EXP_DEBANG_PRICE_BEFOUR_TYPE = 18040102;
	//参数格式异常
	public static final int EXP_DEBANG_PRICE_BEFOUR_STANDARD = 18040103;
	
	
	/***价格查询接口编号05***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_BRANCHE_BEFOUR_NULL = 18050101;
	//参数类型异常
	public static final int EXP_DEBANG_BRANCHE_BEFOUR_TYPE = 18050102;
	//参数格式异常
	public static final int EXP_DEBANG_BRANCHE_BEFOUR_STANDARD = 18050103;
	
	
	/***查询订单详情接口编号06***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_ORDER_BEFOUR_NULL = 18060101;
	//参数类型异常
	public static final int EXP_DEBANG_ORDER_BEFOUR_TYPE = 18060102;
	//参数格式异常
	public static final int EXP_DEBANG_ORDER_BEFOUR_STANDARD = 18060103;
	
	
	/***修改订单接口编号07***/
	//参数NUll或''异常
	public static final int EXP_DEBANG_UPDATE_BEFOUR_NULL = 18070101;
	//参数类型异常
	public static final int EXP_DEBANG_UPDATE_BEFOUR_TYPE = 18070102;
	//参数格式异常
	public static final int EXP_DEBANG_UPDATE_BEFOUR_STANDARD = 18070103;
		
	/***************************** 德邦接口结束  *****************************/
	
	
}
