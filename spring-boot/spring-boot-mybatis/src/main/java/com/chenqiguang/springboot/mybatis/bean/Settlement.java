package com.chenqiguang.springboot.mybatis.bean;

import java.math.BigDecimal;

public class Settlement {

    private static final long serialVersionUID = 214113178;

    private String     settlementId;
    private String     settlementNo;
    private Long       ruleId;
    private String     settlementPeriod;
    private String     businessBillType;
    private String     invoiceType;
    private String     accordingRule;
    private String     predictInvoiceDate;
    private String     sellerTenantCode;
    private String     sellerNoAr;
    private String     sellerNo;
    private String     sellerCode;
    private String     sellerTaxNo;
    private String     sellerName;
    private String     sellerAddress;
    private String     sellerTel;
    private String     sellerBankName;
    private String     sellerBankAccount;
    private String     purchaserTenantCode;
    private String     purchaserNo;
    private String     purchaserNoAr;
    private String     purchaserCode;
    private String     purchaserTaxNo;
    private String     purchaserName;
    private String     purchaserAddress;
    private String     purchaserTel;
    private String     purchaserBankName;
    private String     purchaserBankAccount;
    private Integer    purchaserInvoiceInfoId;
    private Integer    sellerInvoiceInfoId;
    private BigDecimal perinvoiceAmountLimit;
    private String     otherPlatAccount;
    private String     customBillType;
    private BigDecimal amountWithoutTax;
    private BigDecimal taxAmount;
    private BigDecimal amountWithTax;
    private BigDecimal canMakeInvoiceAmountWithTax;
    private BigDecimal alreadyInvoiceAmountWithTax;
    private BigDecimal alreadyAuthAmountWithTax;
    private BigDecimal canMakeInvoiceAmountWithoutTax;
    private BigDecimal alreadyInvoiceAmountWithoutTax;
    private BigDecimal alreadyAuthAmountWithoutTax;
    private BigDecimal canMakeInvoiceTaxAmount;
    private BigDecimal alreadyInvoiceTaxAmount;
    private BigDecimal alreadyAuthTaxAmount;
    private BigDecimal alreadyPayTaxAmount;
    private BigDecimal alreadyPayAmountWithoutTax;
    private BigDecimal alreadyPayAmountWihtTax;
    private BigDecimal alreadyDeposeAmountWithTax;
    private BigDecimal alreadyRedAmountWithTax;
    private BigDecimal discountWithoutTax;
    private BigDecimal discountTax;
    private BigDecimal discountWithTax;
    private String     remark;
    private String     appendRemark;
    private Integer    preInvoiceNums;
    private Integer    canMakeInvoiceNums;
    private Integer    invoiceNums;
    private String     receiveConfirmFlag;
    private String     uploadConfirmFlag;
    private String     status;
    private String     originInvoiceNo;
    private String     originInvoiceCode;
    private String     redNotificationNo;
    private String     orderNo;
    private String     contractNo;
    private String     systemOrig;
    private String     salesBillNo;
    private String     isNeedAuth;
    private String     cooperateFlag;
    private String     requestSerialNo;
    private String     purchaserEmail;
    private String     logisticsStatus;
    private String     createTime;
    private String     createUserId;
    private String     updateTime;
    private String     updateUserId;
    private String     specialExt1;
    private String     specialExt2;
    private String     ext1;
    private String     ext2;
    private String     ext3;
    private String     ext4;
    private String     ext5;
    private String     ext6;
    private String     ext7;
    private String     ext8;
    private String     ext9;
    private String     ext10;
    private String     uploadWay;
    private String     cashierName;
    private String     checkerName;
    private String     invoicerName;
    private String     lockFlag;
    private String     taxRate;
    private String     useingStatus;
    private BigDecimal purAlreadyAmountWithoutTax;
    private BigDecimal purAlreadyTaxAmount;
    private BigDecimal purAlreadyAmountWithTax;
    private String     printContentFlag;
    private Integer    sellerInvoicePersonInfoId;
    private String     purMachStatus;
    private String     reciveUser;

    public Settlement() {
    }

    public Settlement(String settlementId, String settlementNo, Long ruleId, String settlementPeriod, String businessBillType, String invoiceType, String accordingRule, String predictInvoiceDate, String sellerTenantCode, String sellerNoAr, String sellerNo, String sellerCode, String sellerTaxNo, String sellerName, String sellerAddress, String sellerTel, String sellerBankName, String sellerBankAccount, String purchaserTenantCode, String purchaserNo, String purchaserNoAr, String purchaserCode, String purchaserTaxNo, String purchaserName, String purchaserAddress, String purchaserTel, String purchaserBankName, String purchaserBankAccount, Integer purchaserInvoiceInfoId, Integer sellerInvoiceInfoId, BigDecimal perinvoiceAmountLimit, String otherPlatAccount, String customBillType, BigDecimal amountWithoutTax, BigDecimal taxAmount, BigDecimal amountWithTax, BigDecimal canMakeInvoiceAmountWithTax, BigDecimal alreadyInvoiceAmountWithTax, BigDecimal alreadyAuthAmountWithTax, BigDecimal canMakeInvoiceAmountWithoutTax, BigDecimal alreadyInvoiceAmountWithoutTax, BigDecimal alreadyAuthAmountWithoutTax, BigDecimal canMakeInvoiceTaxAmount, BigDecimal alreadyInvoiceTaxAmount, BigDecimal alreadyAuthTaxAmount, BigDecimal alreadyPayTaxAmount, BigDecimal alreadyPayAmountWithoutTax, BigDecimal alreadyPayAmountWihtTax, BigDecimal alreadyDeposeAmountWithTax, BigDecimal alreadyRedAmountWithTax, BigDecimal discountWithoutTax, BigDecimal discountTax, BigDecimal discountWithTax, String remark, String appendRemark, Integer preInvoiceNums, Integer canMakeInvoiceNums, Integer invoiceNums, String receiveConfirmFlag, String uploadConfirmFlag, String status, String originInvoiceNo, String originInvoiceCode, String redNotificationNo, String orderNo, String contractNo, String systemOrig, String salesBillNo, String isNeedAuth, String cooperateFlag, String requestSerialNo, String purchaserEmail, String logisticsStatus, String createTime, String createUserId, String updateTime, String updateUserId, String specialExt1, String specialExt2, String ext1, String ext2, String ext3, String ext4, String ext5, String ext6, String ext7, String ext8, String ext9, String ext10, String uploadWay, String cashierName, String checkerName, String invoicerName, String lockFlag, String taxRate, String useingStatus, BigDecimal purAlreadyAmountWithoutTax, BigDecimal purAlreadyTaxAmount, BigDecimal purAlreadyAmountWithTax, String printContentFlag, Integer sellerInvoicePersonInfoId, String purMachStatus, String reciveUser) {
        this.settlementId = settlementId;
        this.settlementNo = settlementNo;
        this.ruleId = ruleId;
        this.settlementPeriod = settlementPeriod;
        this.businessBillType = businessBillType;
        this.invoiceType = invoiceType;
        this.accordingRule = accordingRule;
        this.predictInvoiceDate = predictInvoiceDate;
        this.sellerTenantCode = sellerTenantCode;
        this.sellerNoAr = sellerNoAr;
        this.sellerNo = sellerNo;
        this.sellerCode = sellerCode;
        this.sellerTaxNo = sellerTaxNo;
        this.sellerName = sellerName;
        this.sellerAddress = sellerAddress;
        this.sellerTel = sellerTel;
        this.sellerBankName = sellerBankName;
        this.sellerBankAccount = sellerBankAccount;
        this.purchaserTenantCode = purchaserTenantCode;
        this.purchaserNo = purchaserNo;
        this.purchaserNoAr = purchaserNoAr;
        this.purchaserCode = purchaserCode;
        this.purchaserTaxNo = purchaserTaxNo;
        this.purchaserName = purchaserName;
        this.purchaserAddress = purchaserAddress;
        this.purchaserTel = purchaserTel;
        this.purchaserBankName = purchaserBankName;
        this.purchaserBankAccount = purchaserBankAccount;
        this.purchaserInvoiceInfoId = purchaserInvoiceInfoId;
        this.sellerInvoiceInfoId = sellerInvoiceInfoId;
        this.perinvoiceAmountLimit = perinvoiceAmountLimit;
        this.otherPlatAccount = otherPlatAccount;
        this.customBillType = customBillType;
        this.amountWithoutTax = amountWithoutTax;
        this.taxAmount = taxAmount;
        this.amountWithTax = amountWithTax;
        this.canMakeInvoiceAmountWithTax = canMakeInvoiceAmountWithTax;
        this.alreadyInvoiceAmountWithTax = alreadyInvoiceAmountWithTax;
        this.alreadyAuthAmountWithTax = alreadyAuthAmountWithTax;
        this.canMakeInvoiceAmountWithoutTax = canMakeInvoiceAmountWithoutTax;
        this.alreadyInvoiceAmountWithoutTax = alreadyInvoiceAmountWithoutTax;
        this.alreadyAuthAmountWithoutTax = alreadyAuthAmountWithoutTax;
        this.canMakeInvoiceTaxAmount = canMakeInvoiceTaxAmount;
        this.alreadyInvoiceTaxAmount = alreadyInvoiceTaxAmount;
        this.alreadyAuthTaxAmount = alreadyAuthTaxAmount;
        this.alreadyPayTaxAmount = alreadyPayTaxAmount;
        this.alreadyPayAmountWithoutTax = alreadyPayAmountWithoutTax;
        this.alreadyPayAmountWihtTax = alreadyPayAmountWihtTax;
        this.alreadyDeposeAmountWithTax = alreadyDeposeAmountWithTax;
        this.alreadyRedAmountWithTax = alreadyRedAmountWithTax;
        this.discountWithoutTax = discountWithoutTax;
        this.discountTax = discountTax;
        this.discountWithTax = discountWithTax;
        this.remark = remark;
        this.appendRemark = appendRemark;
        this.preInvoiceNums = preInvoiceNums;
        this.canMakeInvoiceNums = canMakeInvoiceNums;
        this.invoiceNums = invoiceNums;
        this.receiveConfirmFlag = receiveConfirmFlag;
        this.uploadConfirmFlag = uploadConfirmFlag;
        this.status = status;
        this.originInvoiceNo = originInvoiceNo;
        this.originInvoiceCode = originInvoiceCode;
        this.redNotificationNo = redNotificationNo;
        this.orderNo = orderNo;
        this.contractNo = contractNo;
        this.systemOrig = systemOrig;
        this.salesBillNo = salesBillNo;
        this.isNeedAuth = isNeedAuth;
        this.cooperateFlag = cooperateFlag;
        this.requestSerialNo = requestSerialNo;
        this.purchaserEmail = purchaserEmail;
        this.logisticsStatus = logisticsStatus;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.updateTime = updateTime;
        this.updateUserId = updateUserId;
        this.specialExt1 = specialExt1;
        this.specialExt2 = specialExt2;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.ext3 = ext3;
        this.ext4 = ext4;
        this.ext5 = ext5;
        this.ext6 = ext6;
        this.ext7 = ext7;
        this.ext8 = ext8;
        this.ext9 = ext9;
        this.ext10 = ext10;
        this.uploadWay = uploadWay;
        this.cashierName = cashierName;
        this.checkerName = checkerName;
        this.invoicerName = invoicerName;
        this.lockFlag = lockFlag;
        this.taxRate = taxRate;
        this.useingStatus = useingStatus;
        this.purAlreadyAmountWithoutTax = purAlreadyAmountWithoutTax;
        this.purAlreadyTaxAmount = purAlreadyTaxAmount;
        this.purAlreadyAmountWithTax = purAlreadyAmountWithTax;
        this.printContentFlag = printContentFlag;
        this.sellerInvoicePersonInfoId = sellerInvoicePersonInfoId;
        this.purMachStatus = purMachStatus;
        this.reciveUser = reciveUser;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(String settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public String getBusinessBillType() {
        return businessBillType;
    }

    public void setBusinessBillType(String businessBillType) {
        this.businessBillType = businessBillType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getAccordingRule() {
        return accordingRule;
    }

    public void setAccordingRule(String accordingRule) {
        this.accordingRule = accordingRule;
    }

    public String getPredictInvoiceDate() {
        return predictInvoiceDate;
    }

    public void setPredictInvoiceDate(String predictInvoiceDate) {
        this.predictInvoiceDate = predictInvoiceDate;
    }

    public String getSellerTenantCode() {
        return sellerTenantCode;
    }

    public void setSellerTenantCode(String sellerTenantCode) {
        this.sellerTenantCode = sellerTenantCode;
    }

    public String getSellerNoAr() {
        return sellerNoAr;
    }

    public void setSellerNoAr(String sellerNoAr) {
        this.sellerNoAr = sellerNoAr;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getSellerTaxNo() {
        return sellerTaxNo;
    }

    public void setSellerTaxNo(String sellerTaxNo) {
        this.sellerTaxNo = sellerTaxNo;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerTel() {
        return sellerTel;
    }

    public void setSellerTel(String sellerTel) {
        this.sellerTel = sellerTel;
    }

    public String getSellerBankName() {
        return sellerBankName;
    }

    public void setSellerBankName(String sellerBankName) {
        this.sellerBankName = sellerBankName;
    }

    public String getSellerBankAccount() {
        return sellerBankAccount;
    }

    public void setSellerBankAccount(String sellerBankAccount) {
        this.sellerBankAccount = sellerBankAccount;
    }

    public String getPurchaserTenantCode() {
        return purchaserTenantCode;
    }

    public void setPurchaserTenantCode(String purchaserTenantCode) {
        this.purchaserTenantCode = purchaserTenantCode;
    }

    public String getPurchaserNo() {
        return purchaserNo;
    }

    public void setPurchaserNo(String purchaserNo) {
        this.purchaserNo = purchaserNo;
    }

    public String getPurchaserNoAr() {
        return purchaserNoAr;
    }

    public void setPurchaserNoAr(String purchaserNoAr) {
        this.purchaserNoAr = purchaserNoAr;
    }

    public String getPurchaserCode() {
        return purchaserCode;
    }

    public void setPurchaserCode(String purchaserCode) {
        this.purchaserCode = purchaserCode;
    }

    public String getPurchaserTaxNo() {
        return purchaserTaxNo;
    }

    public void setPurchaserTaxNo(String purchaserTaxNo) {
        this.purchaserTaxNo = purchaserTaxNo;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public String getPurchaserAddress() {
        return purchaserAddress;
    }

    public void setPurchaserAddress(String purchaserAddress) {
        this.purchaserAddress = purchaserAddress;
    }

    public String getPurchaserTel() {
        return purchaserTel;
    }

    public void setPurchaserTel(String purchaserTel) {
        this.purchaserTel = purchaserTel;
    }

    public String getPurchaserBankName() {
        return purchaserBankName;
    }

    public void setPurchaserBankName(String purchaserBankName) {
        this.purchaserBankName = purchaserBankName;
    }

    public String getPurchaserBankAccount() {
        return purchaserBankAccount;
    }

    public void setPurchaserBankAccount(String purchaserBankAccount) {
        this.purchaserBankAccount = purchaserBankAccount;
    }

    public Integer getPurchaserInvoiceInfoId() {
        return purchaserInvoiceInfoId;
    }

    public void setPurchaserInvoiceInfoId(Integer purchaserInvoiceInfoId) {
        this.purchaserInvoiceInfoId = purchaserInvoiceInfoId;
    }

    public Integer getSellerInvoiceInfoId() {
        return sellerInvoiceInfoId;
    }

    public void setSellerInvoiceInfoId(Integer sellerInvoiceInfoId) {
        this.sellerInvoiceInfoId = sellerInvoiceInfoId;
    }

    public BigDecimal getPerinvoiceAmountLimit() {
        return perinvoiceAmountLimit;
    }

    public void setPerinvoiceAmountLimit(BigDecimal perinvoiceAmountLimit) {
        this.perinvoiceAmountLimit = perinvoiceAmountLimit;
    }

    public String getOtherPlatAccount() {
        return otherPlatAccount;
    }

    public void setOtherPlatAccount(String otherPlatAccount) {
        this.otherPlatAccount = otherPlatAccount;
    }

    public String getCustomBillType() {
        return customBillType;
    }

    public void setCustomBillType(String customBillType) {
        this.customBillType = customBillType;
    }

    public BigDecimal getAmountWithoutTax() {
        return amountWithoutTax;
    }

    public void setAmountWithoutTax(BigDecimal amountWithoutTax) {
        this.amountWithoutTax = amountWithoutTax;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getAmountWithTax() {
        return amountWithTax;
    }

    public void setAmountWithTax(BigDecimal amountWithTax) {
        this.amountWithTax = amountWithTax;
    }

    public BigDecimal getCanMakeInvoiceAmountWithTax() {
        return canMakeInvoiceAmountWithTax;
    }

    public void setCanMakeInvoiceAmountWithTax(BigDecimal canMakeInvoiceAmountWithTax) {
        this.canMakeInvoiceAmountWithTax = canMakeInvoiceAmountWithTax;
    }

    public BigDecimal getAlreadyInvoiceAmountWithTax() {
        return alreadyInvoiceAmountWithTax;
    }

    public void setAlreadyInvoiceAmountWithTax(BigDecimal alreadyInvoiceAmountWithTax) {
        this.alreadyInvoiceAmountWithTax = alreadyInvoiceAmountWithTax;
    }

    public BigDecimal getAlreadyAuthAmountWithTax() {
        return alreadyAuthAmountWithTax;
    }

    public void setAlreadyAuthAmountWithTax(BigDecimal alreadyAuthAmountWithTax) {
        this.alreadyAuthAmountWithTax = alreadyAuthAmountWithTax;
    }

    public BigDecimal getCanMakeInvoiceAmountWithoutTax() {
        return canMakeInvoiceAmountWithoutTax;
    }

    public void setCanMakeInvoiceAmountWithoutTax(BigDecimal canMakeInvoiceAmountWithoutTax) {
        this.canMakeInvoiceAmountWithoutTax = canMakeInvoiceAmountWithoutTax;
    }

    public BigDecimal getAlreadyInvoiceAmountWithoutTax() {
        return alreadyInvoiceAmountWithoutTax;
    }

    public void setAlreadyInvoiceAmountWithoutTax(BigDecimal alreadyInvoiceAmountWithoutTax) {
        this.alreadyInvoiceAmountWithoutTax = alreadyInvoiceAmountWithoutTax;
    }

    public BigDecimal getAlreadyAuthAmountWithoutTax() {
        return alreadyAuthAmountWithoutTax;
    }

    public void setAlreadyAuthAmountWithoutTax(BigDecimal alreadyAuthAmountWithoutTax) {
        this.alreadyAuthAmountWithoutTax = alreadyAuthAmountWithoutTax;
    }

    public BigDecimal getCanMakeInvoiceTaxAmount() {
        return canMakeInvoiceTaxAmount;
    }

    public void setCanMakeInvoiceTaxAmount(BigDecimal canMakeInvoiceTaxAmount) {
        this.canMakeInvoiceTaxAmount = canMakeInvoiceTaxAmount;
    }

    public BigDecimal getAlreadyInvoiceTaxAmount() {
        return alreadyInvoiceTaxAmount;
    }

    public void setAlreadyInvoiceTaxAmount(BigDecimal alreadyInvoiceTaxAmount) {
        this.alreadyInvoiceTaxAmount = alreadyInvoiceTaxAmount;
    }

    public BigDecimal getAlreadyAuthTaxAmount() {
        return alreadyAuthTaxAmount;
    }

    public void setAlreadyAuthTaxAmount(BigDecimal alreadyAuthTaxAmount) {
        this.alreadyAuthTaxAmount = alreadyAuthTaxAmount;
    }

    public BigDecimal getAlreadyPayTaxAmount() {
        return alreadyPayTaxAmount;
    }

    public void setAlreadyPayTaxAmount(BigDecimal alreadyPayTaxAmount) {
        this.alreadyPayTaxAmount = alreadyPayTaxAmount;
    }

    public BigDecimal getAlreadyPayAmountWithoutTax() {
        return alreadyPayAmountWithoutTax;
    }

    public void setAlreadyPayAmountWithoutTax(BigDecimal alreadyPayAmountWithoutTax) {
        this.alreadyPayAmountWithoutTax = alreadyPayAmountWithoutTax;
    }

    public BigDecimal getAlreadyPayAmountWihtTax() {
        return alreadyPayAmountWihtTax;
    }

    public void setAlreadyPayAmountWihtTax(BigDecimal alreadyPayAmountWihtTax) {
        this.alreadyPayAmountWihtTax = alreadyPayAmountWihtTax;
    }

    public BigDecimal getAlreadyDeposeAmountWithTax() {
        return alreadyDeposeAmountWithTax;
    }

    public void setAlreadyDeposeAmountWithTax(BigDecimal alreadyDeposeAmountWithTax) {
        this.alreadyDeposeAmountWithTax = alreadyDeposeAmountWithTax;
    }

    public BigDecimal getAlreadyRedAmountWithTax() {
        return alreadyRedAmountWithTax;
    }

    public void setAlreadyRedAmountWithTax(BigDecimal alreadyRedAmountWithTax) {
        this.alreadyRedAmountWithTax = alreadyRedAmountWithTax;
    }

    public BigDecimal getDiscountWithoutTax() {
        return discountWithoutTax;
    }

    public void setDiscountWithoutTax(BigDecimal discountWithoutTax) {
        this.discountWithoutTax = discountWithoutTax;
    }

    public BigDecimal getDiscountTax() {
        return discountTax;
    }

    public void setDiscountTax(BigDecimal discountTax) {
        this.discountTax = discountTax;
    }

    public BigDecimal getDiscountWithTax() {
        return discountWithTax;
    }

    public void setDiscountWithTax(BigDecimal discountWithTax) {
        this.discountWithTax = discountWithTax;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAppendRemark() {
        return appendRemark;
    }

    public void setAppendRemark(String appendRemark) {
        this.appendRemark = appendRemark;
    }

    public Integer getPreInvoiceNums() {
        return preInvoiceNums;
    }

    public void setPreInvoiceNums(Integer preInvoiceNums) {
        this.preInvoiceNums = preInvoiceNums;
    }

    public Integer getCanMakeInvoiceNums() {
        return canMakeInvoiceNums;
    }

    public void setCanMakeInvoiceNums(Integer canMakeInvoiceNums) {
        this.canMakeInvoiceNums = canMakeInvoiceNums;
    }

    public Integer getInvoiceNums() {
        return invoiceNums;
    }

    public void setInvoiceNums(Integer invoiceNums) {
        this.invoiceNums = invoiceNums;
    }

    public String getReceiveConfirmFlag() {
        return receiveConfirmFlag;
    }

    public void setReceiveConfirmFlag(String receiveConfirmFlag) {
        this.receiveConfirmFlag = receiveConfirmFlag;
    }

    public String getUploadConfirmFlag() {
        return uploadConfirmFlag;
    }

    public void setUploadConfirmFlag(String uploadConfirmFlag) {
        this.uploadConfirmFlag = uploadConfirmFlag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginInvoiceNo() {
        return originInvoiceNo;
    }

    public void setOriginInvoiceNo(String originInvoiceNo) {
        this.originInvoiceNo = originInvoiceNo;
    }

    public String getOriginInvoiceCode() {
        return originInvoiceCode;
    }

    public void setOriginInvoiceCode(String originInvoiceCode) {
        this.originInvoiceCode = originInvoiceCode;
    }

    public String getRedNotificationNo() {
        return redNotificationNo;
    }

    public void setRedNotificationNo(String redNotificationNo) {
        this.redNotificationNo = redNotificationNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getSystemOrig() {
        return systemOrig;
    }

    public void setSystemOrig(String systemOrig) {
        this.systemOrig = systemOrig;
    }

    public String getSalesBillNo() {
        return salesBillNo;
    }

    public void setSalesBillNo(String salesBillNo) {
        this.salesBillNo = salesBillNo;
    }

    public String getIsNeedAuth() {
        return isNeedAuth;
    }

    public void setIsNeedAuth(String isNeedAuth) {
        this.isNeedAuth = isNeedAuth;
    }

    public String getCooperateFlag() {
        return cooperateFlag;
    }

    public void setCooperateFlag(String cooperateFlag) {
        this.cooperateFlag = cooperateFlag;
    }

    public String getRequestSerialNo() {
        return requestSerialNo;
    }

    public void setRequestSerialNo(String requestSerialNo) {
        this.requestSerialNo = requestSerialNo;
    }

    public String getPurchaserEmail() {
        return purchaserEmail;
    }

    public void setPurchaserEmail(String purchaserEmail) {
        this.purchaserEmail = purchaserEmail;
    }

    public String getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getSpecialExt1() {
        return specialExt1;
    }

    public void setSpecialExt1(String specialExt1) {
        this.specialExt1 = specialExt1;
    }

    public String getSpecialExt2() {
        return specialExt2;
    }

    public void setSpecialExt2(String specialExt2) {
        this.specialExt2 = specialExt2;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public String getExt6() {
        return ext6;
    }

    public void setExt6(String ext6) {
        this.ext6 = ext6;
    }

    public String getExt7() {
        return ext7;
    }

    public void setExt7(String ext7) {
        this.ext7 = ext7;
    }

    public String getExt8() {
        return ext8;
    }

    public void setExt8(String ext8) {
        this.ext8 = ext8;
    }

    public String getExt9() {
        return ext9;
    }

    public void setExt9(String ext9) {
        this.ext9 = ext9;
    }

    public String getExt10() {
        return ext10;
    }

    public void setExt10(String ext10) {
        this.ext10 = ext10;
    }

    public String getUploadWay() {
        return uploadWay;
    }

    public void setUploadWay(String uploadWay) {
        this.uploadWay = uploadWay;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public String getInvoicerName() {
        return invoicerName;
    }

    public void setInvoicerName(String invoicerName) {
        this.invoicerName = invoicerName;
    }

    public String getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getUseingStatus() {
        return useingStatus;
    }

    public void setUseingStatus(String useingStatus) {
        this.useingStatus = useingStatus;
    }

    public BigDecimal getPurAlreadyAmountWithoutTax() {
        return purAlreadyAmountWithoutTax;
    }

    public void setPurAlreadyAmountWithoutTax(BigDecimal purAlreadyAmountWithoutTax) {
        this.purAlreadyAmountWithoutTax = purAlreadyAmountWithoutTax;
    }

    public BigDecimal getPurAlreadyTaxAmount() {
        return purAlreadyTaxAmount;
    }

    public void setPurAlreadyTaxAmount(BigDecimal purAlreadyTaxAmount) {
        this.purAlreadyTaxAmount = purAlreadyTaxAmount;
    }

    public BigDecimal getPurAlreadyAmountWithTax() {
        return purAlreadyAmountWithTax;
    }

    public void setPurAlreadyAmountWithTax(BigDecimal purAlreadyAmountWithTax) {
        this.purAlreadyAmountWithTax = purAlreadyAmountWithTax;
    }

    public String getPrintContentFlag() {
        return printContentFlag;
    }

    public void setPrintContentFlag(String printContentFlag) {
        this.printContentFlag = printContentFlag;
    }

    public Integer getSellerInvoicePersonInfoId() {
        return sellerInvoicePersonInfoId;
    }

    public void setSellerInvoicePersonInfoId(Integer sellerInvoicePersonInfoId) {
        this.sellerInvoicePersonInfoId = sellerInvoicePersonInfoId;
    }

    public String getPurMachStatus() {
        return purMachStatus;
    }

    public void setPurMachStatus(String purMachStatus) {
        this.purMachStatus = purMachStatus;
    }

    public String getReciveUser() {
        return reciveUser;
    }

    public void setReciveUser(String reciveUser) {
        this.reciveUser = reciveUser;
    }
}
