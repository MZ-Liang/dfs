package com.dfs.api.entity.book;

import java.io.Serializable;
import java.math.BigDecimal;

import com.dfs.api.core.entity.Entity;

/**
 * 图书表实体
 * 
 * @author Ming
 * @date 2018-11-13
 */
public class BookEntity extends Entity implements Serializable {

	/** SerialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 图书名称 */
	private String bookName;

	/** 图书名称(英文) */
	private String bookNameEn;

	/** 图书副名 */
	private String deputyName;

	/** 图书副名(英文) */
	private String deputyNameEn;

	/** 状态(0:编辑中 1:待质检 2:待通过 3:待发布 4:已发布 5:撤回重新提交) */
	private Integer status;

	/** 错误码 */
	private Long errorCode;

	/** 图书类别 */
	private Long bookType;

	/** 出版机构 */
	private String publishingInstitution;

	/** 出版地 */
	private String publishingPlace;

	/** 印刷日期 */
	private Long printingTime;

	/** 版次 */
	private String editionNumber;

	/** 印次 */
	private String impression;

	/** 出版号 */
	private String isbn;

	/** 著作方式 */
	private Long writingmode;

	/** 其它作者著作方式 */
	private Long otherWritingmode;

	/** 是否本地上传(0:否 1:是) */
	private Integer localUploadFlag;

	/** 电子版权(0:无  1:有) */
	private Integer ertFlag;

	/** 电子版权到期日期 */
	private Long ertDueTime;

	/** 纸质书价格 */
	private BigDecimal paperBookPrice;

	/** 电子书价格 */
	private BigDecimal ebookPrice;

	/** 创建者 */
	private Long creator;

	/** 创建时间 */
	private Long createTime;

	/** 更新者 */
	private Long regenerator;

	/** 更新时间 */
	private Long updateTime;

	/** 出版日期 */
	private Long publishingTime;

	/** 发布日期 */
	private Long issueTime;

	/** 丛书*/
	private Long series;

	/** 中图法分类号 */
	private String classificationNumber;

	/** 中图法分类 */
	private String classification;

	/** 新书核准号 */
	private String newBookApprovalNumber;

	/** 数据来源 */
	private Long dataSources;

	/** 封面 */
	private Long cover;

	/** 读者对象 */
	private String reader;

	/** 正文用纸 */
	private String textPaper;

	/** 装帧 */
	private String binding;

	/** 页数 */
	private Long pages;

	/** 字数 */
	private String wordNumber;

	/** 包册 */
	private String packageBook;

	/** 首印数 */
	private Long firstPrintNumber;

	/** 开本 */
	private String format;

	/** 单位印张 */
	private String unitSheet;

	/** 内容简介 */
	private String contentIntroduction;

	/** 备注 */
	private String remark;

	/** 上架建议 */
	private String shelfSuggestion;

	/** 前言 */
	private String introduction;

	/** 目录 */
	private String catalog;

	/** 广告语 */
	private String slogan;

	/** 编辑推荐 */
	private String editorRecom;

	/** 媒体评论 */
	private String mediaCommentary;

	/** 书摘 */
	private String bookExtract;

	/**
	 * 取得图书名称
	 * 
	 * @return 图书名称
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * 设定图书名称
	 * 
	 * @param bookName 图书名称
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * 取得图书名称(英文)
	 * 
	 * @return 图书名称(英文)
	 */
	public String getBookNameEn() {
		return bookNameEn;
	}

	/**
	 * 设定图书名称(英文)
	 * 
	 * @param bookNameEn 图书名称(英文)
	 */
	public void setBookNameEn(String bookNameEn) {
		this.bookNameEn = bookNameEn;
	}

	/**
	 * 取得图书副名
	 * 
	 * @return 图书副名
	 */
	public String getDeputyName() {
		return deputyName;
	}

	/**
	 * 设定图书副名
	 * 
	 * @param deputyName 图书副名
	 */
	public void setDeputyName(String deputyName) {
		this.deputyName = deputyName;
	}

	/**
	 * 取得图书副名(英文)
	 * 
	 * @return 图书副名(英文)
	 */
	public String getDeputyNameEn() {
		return deputyNameEn;
	}

	/**
	 * 设定图书副名(英文)
	 * 
	 * @param deputyNameEn 图书副名(英文)
	 */
	public void setDeputyNameEn(String deputyNameEn) {
		this.deputyNameEn = deputyNameEn;
	}

	/**
	 * 取得状态(0:编辑中 1:待质检 2:待通过 3:待发布 4:已发布 5:撤回重新提交)
	 * 
	 * @return 状态(0:编辑中 1:待质检 2:待通过 3:待发布 4:已发布 5:撤回重新提交)
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设定状态(0:编辑中 1:待质检 2:待通过 3:待发布 4:已发布 5:撤回重新提交)
	 * 
	 * @param status 状态(0:编辑中 1:待质检 2:待通过 3:待发布 4:已发布 5:撤回重新提交)
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 取得错误码
	 * 
	 * @return 错误码
	 */
	public Long getErrorCode() {
		return errorCode;
	}

	/**
	 * 设定错误码
	 * 
	 * @param errorCode 错误码
	 */
	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 取得图书类别
	 * 
	 * @return 图书类别
	 */
	public Long getBookType() {
		return bookType;
	}

	/**
	 * 设定图书类别
	 * 
	 * @param bookType 图书类别
	 */
	public void setBookType(Long bookType) {
		this.bookType = bookType;
	}

	/**
	 * 取得出版机构
	 * 
	 * @return 出版机构
	 */
	public String getPublishingInstitution() {
		return publishingInstitution;
	}

	/**
	 * 设定出版机构
	 * 
	 * @param publishingInstitution 出版机构
	 */
	public void setPublishingInstitution(String publishingInstitution) {
		this.publishingInstitution = publishingInstitution;
	}

	/**
	 * 取得出版地
	 * 
	 * @return 出版地
	 */
	public String getPublishingPlace() {
		return publishingPlace;
	}

	/**
	 * 设定出版地
	 * 
	 * @param publishingPlace 出版地
	 */
	public void setPublishingPlace(String publishingPlace) {
		this.publishingPlace = publishingPlace;
	}

	/**
	 * 取得印刷日期
	 * 
	 * @return 印刷日期
	 */
	public Long getPrintingTime() {
		return printingTime;
	}

	/**
	 * 设定印刷日期
	 * 
	 * @param printingTime 印刷日期
	 */
	public void setPrintingTime(Long printingTime) {
		this.printingTime = printingTime;
	}

	/**
	 * 取得版次
	 * 
	 * @return 版次
	 */
	public String getEditionNumber() {
		return editionNumber;
	}

	/**
	 * 设定版次
	 * 
	 * @param editionNumber 版次
	 */
	public void setEditionNumber(String editionNumber) {
		this.editionNumber = editionNumber;
	}

	/**
	 * 取得印次
	 * 
	 * @return 印次
	 */
	public String getImpression() {
		return impression;
	}

	/**
	 * 设定印次
	 * 
	 * @param impression 印次
	 */
	public void setImpression(String impression) {
		this.impression = impression;
	}

	/**
	 * 取得出版号
	 * 
	 * @return 出版号
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * 设定出版号
	 * 
	 * @param isbn 出版号
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * 取得著作方式
	 * 
	 * @return 著作方式
	 */
	public Long getWritingmode() {
		return writingmode;
	}

	/**
	 * 设定著作方式
	 * 
	 * @param writingmode 著作方式
	 */
	public void setWritingmode(Long writingmode) {
		this.writingmode = writingmode;
	}

	/**
	 * 取得其它作者著作方式
	 * 
	 * @return 其它作者著作方式
	 */
	public Long getOtherWritingmode() {
		return otherWritingmode;
	}

	/**
	 * 设定其它作者著作方式
	 * 
	 * @param otherWritingmode 其它作者著作方式
	 */
	public void setOtherWritingmode(Long otherWritingmode) {
		this.otherWritingmode = otherWritingmode;
	}

	/**
	 * 取得是否本地上传(0:否 1:是)
	 * 
	 * @return 是否本地上传(0:否 1:是)
	 */
	public Integer getLocalUploadFlag() {
		return localUploadFlag;
	}

	/**
	 * 设定是否本地上传(0:否 1:是)
	 * 
	 * @param localUploadFlag 是否本地上传(0:否 1:是)
	 */
	public void setLocalUploadFlag(Integer localUploadFlag) {
		this.localUploadFlag = localUploadFlag;
	}

	/**
	 * 取得电子版权(0:无  1:有)
	 * 
	 * @return 电子版权(0:无  1:有)
	 */
	public Integer getErtFlag() {
		return ertFlag;
	}

	/**
	 * 设定电子版权(0:无  1:有)
	 * 
	 * @param ertFlag 电子版权(0:无  1:有)
	 */
	public void setErtFlag(Integer ertFlag) {
		this.ertFlag = ertFlag;
	}

	/**
	 * 取得电子版权到期日期
	 * 
	 * @return 电子版权到期日期
	 */
	public Long getErtDueTime() {
		return ertDueTime;
	}

	/**
	 * 设定电子版权到期日期
	 * 
	 * @param ertDueTime 电子版权到期日期
	 */
	public void setErtDueTime(Long ertDueTime) {
		this.ertDueTime = ertDueTime;
	}

	/**
	 * 取得纸质书价格
	 * 
	 * @return 纸质书价格
	 */
	public BigDecimal getPaperBookPrice() {
		return paperBookPrice;
	}

	/**
	 * 设定纸质书价格
	 * 
	 * @param paperBookPrice 纸质书价格
	 */
	public void setPaperBookPrice(BigDecimal paperBookPrice) {
		this.paperBookPrice = paperBookPrice;
	}

	/**
	 * 取得电子书价格
	 * 
	 * @return 电子书价格
	 */
	public BigDecimal getEbookPrice() {
		return ebookPrice;
	}

	/**
	 * 设定电子书价格
	 * 
	 * @param ebookPrice 电子书价格
	 */
	public void setEbookPrice(BigDecimal ebookPrice) {
		this.ebookPrice = ebookPrice;
	}

	/**
	 * 取得创建者
	 * 
	 * @return 创建者
	 */
	public Long getCreator() {
		return creator;
	}

	/**
	 * 设定创建者
	 * 
	 * @param creator 创建者
	 */
	public void setCreator(Long creator) {
		this.creator = creator;
	}

	/**
	 * 取得创建时间
	 * 
	 * @return 创建时间
	 */
	public Long getCreateTime() {
		return createTime;
	}

	/**
	 * 设定创建时间
	 * 
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	/**
	 * 取得更新者
	 * 
	 * @return 更新者
	 */
	public Long getRegenerator() {
		return regenerator;
	}

	/**
	 * 设定更新者
	 * 
	 * @param regenerator 更新者
	 */
	public void setRegenerator(Long regenerator) {
		this.regenerator = regenerator;
	}

	/**
	 * 取得更新时间
	 * 
	 * @return 更新时间
	 */
	public Long getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设定更新时间
	 * 
	 * @param updateTime 更新时间
	 */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 取得出版日期
	 * 
	 * @return 出版日期
	 */
	public Long getPublishingTime() {
		return publishingTime;
	}

	/**
	 * 设定出版日期
	 * 
	 * @param publishingTime 出版日期
	 */
	public void setPublishingTime(Long publishingTime) {
		this.publishingTime = publishingTime;
	}

	/**
	 * 取得发布日期
	 * 
	 * @return 发布日期
	 */
	public Long getIssueTime() {
		return issueTime;
	}

	/**
	 * 设定发布日期
	 * 
	 * @param issueTime 发布日期
	 */
	public void setIssueTime(Long issueTime) {
		this.issueTime = issueTime;
	}

	/**
	 * 获取丛书
	 * @return
	 */
	public Long getSeries() {
		return series;
	}

	/**
	 * 设置丛书
	 * @param series
	 */
	public void setSeries(Long series) {
		this.series = series;
	}

	/**
	 * 取得中图法分类号
	 * 
	 * @return 中图法分类号
	 */
	public String getClassificationNumber() {
		return classificationNumber;
	}

	/**
	 * 设定中图法分类号
	 * 
	 * @param classificationNumber 中图法分类号
	 */
	public void setClassificationNumber(String classificationNumber) {
		this.classificationNumber = classificationNumber;
	}

	/**
	 * 取得中图法分类
	 * 
	 * @return 中图法分类
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * 设定中图法分类
	 * 
	 * @param classification 中图法分类
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}

	/**
	 * 取得新书核准号
	 * 
	 * @return 新书核准号
	 */
	public String getNewBookApprovalNumber() {
		return newBookApprovalNumber;
	}

	/**
	 * 设定新书核准号
	 * 
	 * @param newBookApprovalNumber 新书核准号
	 */
	public void setNewBookApprovalNumber(String newBookApprovalNumber) {
		this.newBookApprovalNumber = newBookApprovalNumber;
	}

	/**
	 * 取得数据来源
	 * 
	 * @return 数据来源
	 */
	public Long getDataSources() {
		return dataSources;
	}

	/**
	 * 设定数据来源
	 * 
	 * @param dataSources 数据来源
	 */
	public void setDataSources(Long dataSources) {
		this.dataSources = dataSources;
	}

	/**
	 * 取得封面
	 * 
	 * @return 封面
	 */
	public Long getCover() {
		return cover;
	}

	/**
	 * 设定封面
	 * 
	 * @param cover 封面
	 */
	public void setCover(Long cover) {
		this.cover = cover;
	}

	/**
	 * 取得读者对象
	 * 
	 * @return 读者对象
	 */
	public String getReader() {
		return reader;
	}

	/**
	 * 设定读者对象
	 * 
	 * @param reader 读者对象
	 */
	public void setReader(String reader) {
		this.reader = reader;
	}

	/**
	 * 取得正文用纸
	 * 
	 * @return 正文用纸
	 */
	public String getTextPaper() {
		return textPaper;
	}

	/**
	 * 设定正文用纸
	 * 
	 * @param textPaper 正文用纸
	 */
	public void setTextPaper(String textPaper) {
		this.textPaper = textPaper;
	}

	/**
	 * 取得装帧
	 * 
	 * @return 装帧
	 */
	public String getBinding() {
		return binding;
	}

	/**
	 * 设定装帧
	 * 
	 * @param binding 装帧
	 */
	public void setBinding(String binding) {
		this.binding = binding;
	}

	/**
	 * 取得页数
	 * 
	 * @return 页数
	 */
	public Long getPages() {
		return pages;
	}

	/**
	 * 设定页数
	 * 
	 * @param pages 页数
	 */
	public void setPages(Long pages) {
		this.pages = pages;
	}

	/**
	 * 取得字数
	 * 
	 * @return 
	 */
	public String getWordNumber() {
		return wordNumber;
	}

	/**
	 * 设定字数
	 * 
	 * @param wordNumber 
	 */
	public void setWordNumber(String wordNumber) {
		this.wordNumber = wordNumber;
	}

	/**
	 * 取得包册
	 * 
	 * @return 包册
	 */
	public String getPackageBook() {
		return packageBook;
	}

	/**
	 * 设定包册
	 * 
	 * @param packageBook 包册
	 */
	public void setPackageBook(String packageBook) {
		this.packageBook = packageBook;
	}

	/**
	 * 取得首印数
	 * 
	 * @return 首印数
	 */
	public Long getFirstPrintNumber() {
		return firstPrintNumber;
	}

	/**
	 * 设定首印数
	 * 
	 * @param firstPrintNumber 首印数
	 */
	public void setFirstPrintNumber(Long firstPrintNumber) {
		this.firstPrintNumber = firstPrintNumber;
	}

	/**
	 * 取得开本
	 * 
	 * @return 开本
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * 设定开本
	 * 
	 * @param format 开本
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * 取得单位印张
	 * 
	 * @return 单位印张
	 */
	public String getUnitSheet() {
		return unitSheet;
	}

	/**
	 * 设定单位印张
	 * 
	 * @param unitSheet 单位印张
	 */
	public void setUnitSheet(String unitSheet) {
		this.unitSheet = unitSheet;
	}

	/**
	 * 取得内容简介
	 * 
	 * @return 内容简介
	 */
	public String getContentIntroduction() {
		return contentIntroduction;
	}

	/**
	 * 设定内容简介
	 * 
	 * @param contentIntroduction 内容简介
	 */
	public void setContentIntroduction(String contentIntroduction) {
		this.contentIntroduction = contentIntroduction;
	}

	/**
	 * 取得备注
	 * 
	 * @return 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设定备注
	 * 
	 * @param remark 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 取得上架建议
	 * 
	 * @return 上架建议
	 */
	public String getShelfSuggestion() {
		return shelfSuggestion;
	}

	/**
	 * 设定上架建议
	 * 
	 * @param shelfSuggestion 上架建议
	 */
	public void setShelfSuggestion(String shelfSuggestion) {
		this.shelfSuggestion = shelfSuggestion;
	}

	/**
	 * 取得前言
	 * 
	 * @return 
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * 设定前言
	 * 
	 * @param introduction 
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * 取得目录
	 * 
	 * @return 目录
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * 设定目录
	 * 
	 * @param catalog 目录
	 */
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	/**
	 * 取得广告语
	 * 
	 * @return 广告语
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * 设定广告语
	 * 
	 * @param slogan 广告语
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	/**
	 * 取得编辑推荐
	 * 
	 * @return 编辑推荐
	 */
	public String getEditorRecom() {
		return editorRecom;
	}

	/**
	 * 设定编辑推荐
	 * 
	 * @param editorRecom 编辑推荐
	 */
	public void setEditorRecom(String editorRecom) {
		this.editorRecom = editorRecom;
	}

	/**
	 * 取得媒体评论
	 * 
	 * @return 媒体评论
	 */
	public String getMediaCommentary() {
		return mediaCommentary;
	}

	/**
	 * 设定媒体评论
	 * 
	 * @param mediaCommentary 媒体评论
	 */
	public void setMediaCommentary(String mediaCommentary) {
		this.mediaCommentary = mediaCommentary;
	}

	/**
	 * 取得书摘
	 * 
	 * @return 书摘
	 */
	public String getBookExtract() {
		return bookExtract;
	}

	/**
	 * 设定书摘
	 * 
	 * @param bookExtract 书摘
	 */
	public void setBookExtract(String bookExtract) {
		this.bookExtract = bookExtract;
	}

	/**
	 * 取得图书表实体字符串
	 * 
	 * @return 图书表实体字符串
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", bookName=").append(bookName);
		sb.append(", bookNameEn=").append(bookNameEn);
		sb.append(", deputyName=").append(deputyName);
		sb.append(", deputyNameEn=").append(deputyNameEn);
		sb.append(", status=").append(status);
		sb.append(", errorCode=").append(errorCode);
		sb.append(", bookType=").append(bookType);
		sb.append(", publishingInstitution=").append(publishingInstitution);
		sb.append(", publishingPlace=").append(publishingPlace);
		sb.append(", printingTime=").append(printingTime);
		sb.append(", editionNumber=").append(editionNumber);
		sb.append(", impression=").append(impression);
		sb.append(", isbn=").append(isbn);
		sb.append(", writingmode=").append(writingmode);
		sb.append(", otherWritingmode=").append(otherWritingmode);
		sb.append(", localUploadFlag=").append(localUploadFlag);
		sb.append(", ertFlag=").append(ertFlag);
		sb.append(", ertDueTime=").append(ertDueTime);
		sb.append(", paperBookPrice=").append(paperBookPrice);
		sb.append(", ebookPrice=").append(ebookPrice);
		sb.append(", creator=").append(creator);
		sb.append(", createTime=").append(createTime);
		sb.append(", regenerator=").append(regenerator);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", publishingTime=").append(publishingTime);
		sb.append(", issueTime=").append(issueTime);
		sb.append(", series=").append(series);
		sb.append(", classificationNumber=").append(classificationNumber);
		sb.append(", classification=").append(classification);
		sb.append(", newBookApprovalNumber=").append(newBookApprovalNumber);
		sb.append(", dataSources=").append(dataSources);
		sb.append(", cover=").append(cover);
		sb.append(", reader=").append(reader);
		sb.append(", textPaper=").append(textPaper);
		sb.append(", binding=").append(binding);
		sb.append(", pages=").append(pages);
		sb.append(", wordNumber=").append(wordNumber);
		sb.append(", packageBook=").append(packageBook);
		sb.append(", firstPrintNumber=").append(firstPrintNumber);
		sb.append(", format=").append(format);
		sb.append(", unitSheet=").append(unitSheet);
		sb.append(", contentIntroduction=").append(contentIntroduction);
		sb.append(", remark=").append(remark);
		sb.append(", shelfSuggestion=").append(shelfSuggestion);
		sb.append(", introduction=").append(introduction);
		sb.append(", catalog=").append(catalog);
		sb.append(", slogan=").append(slogan);
		sb.append(", editorRecom=").append(editorRecom);
		sb.append(", mediaCommentary=").append(mediaCommentary);
		sb.append(", bookExtract=").append(bookExtract);
		sb.append("]");
		return sb.toString();
	}
}