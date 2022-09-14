
package com.example.demo.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.example.demo.domain.Id;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "approvalfy",
    "board_approval_month",
    "boardapprovaldate",
    "borrower",
    "closingdate",
    "country_namecode",
    "countrycode",
    "countryname",
    "countryshortname",
    "docty",
    "envassesmentcategorycode",
    "grantamt",
    "ibrdcommamt",
    "id",
    "idacommamt",
    "impagency",
    "lendinginstr",
    "lendinginstrtype",
    "lendprojectcost",
    "majorsector_percent",
    "mjsector_namecode",
    "mjtheme",
    "mjtheme_namecode",
    "mjthemecode",
    "prodline",
    "prodlinetext",
    "productlinetype",
    "project_abstract",
    "project_name",
    "projectdocs",
    "projectfinancialtype",
    "projectstatusdisplay",
    "regionname",
    "sector",
    "sector1",
    "sector2",
    "sector3",
    "sector4",
    "sector_namecode",
    "sectorcode",
    "source",
    "status",
    "supplementprojectflg",
    "theme1",
    "theme_namecode",
    "themecode",
    "totalamt",
    "totalcommamt",
    "url"
})
@Generated("jsonschema2pojo")
public class Project implements Serializable
{
    public Id _id;
    @JsonProperty("approvalfy")
    private Integer approvalfy;
    @JsonProperty("board_approval_month")
    private String boardApprovalMonth;
    @JsonProperty("boardapprovaldate")
    private String boardapprovaldate;
    @JsonProperty("borrower")
    private String borrower;
    @JsonProperty("closingdate")
    private String closingdate;
    @JsonProperty("country_namecode")
    private String countryNamecode;
    @JsonProperty("countrycode")
    private String countrycode;
    @JsonProperty("countryname")
    private String countryname;
    @JsonProperty("countryshortname")
    private String countryshortname;
    @JsonProperty("docty")
    private String docty;
    @JsonProperty("envassesmentcategorycode")
    private String envassesmentcategorycode;
    @JsonProperty("grantamt")
    private Integer grantamt;
    @JsonProperty("ibrdcommamt")
    private Integer ibrdcommamt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("idacommamt")
    private Integer idacommamt;
    @JsonProperty("impagency")
    private String impagency;
    @JsonProperty("lendinginstr")
    private String lendinginstr;
    @JsonProperty("lendinginstrtype")
    private String lendinginstrtype;
    @JsonProperty("lendprojectcost")
    private Long lendprojectcost;
    @JsonProperty("majorsector_percent")
    private List<MajorsectorPercent> majorsectorPercent = null;
    @JsonProperty("mjsector_namecode")
    private List<MjsectorNamecode> mjsectorNamecode = null;
    @JsonProperty("mjtheme")
    private List<String> mjtheme = null;
    @JsonProperty("mjtheme_namecode")
    private List<MjthemeNamecode> mjthemeNamecode = null;
    @JsonProperty("mjthemecode")
    private String mjthemecode;
    @JsonProperty("prodline")
    private String prodline;
    @JsonProperty("prodlinetext")
    private String prodlinetext;
    @JsonProperty("productlinetype")
    private String productlinetype;
    @JsonProperty("project_abstract")
    private ProjectAbstract projectAbstract;
    @JsonProperty("project_name")
    private String projectName;
    @JsonProperty("projectdocs")
    private List<Projectdoc> projectdocs = null;
    @JsonProperty("projectfinancialtype")
    private String projectfinancialtype;
    @JsonProperty("projectstatusdisplay")
    private String projectstatusdisplay;
    @JsonProperty("regionname")
    private String regionname;
    @JsonProperty("sector")
    private List<Sector> sector = null;
    @JsonProperty("sector1")
    private Sector1 sector1;
    @JsonProperty("sector2")
    private Sector2 sector2;
    @JsonProperty("sector3")
    private Sector3 sector3;
    @JsonProperty("sector4")
    private Sector4 sector4;
    @JsonProperty("sector_namecode")
    private List<SectorNamecode> sectorNamecode = null;
    @JsonProperty("sectorcode")
    private String sectorcode;
    @JsonProperty("source")
    private String source;
    @JsonProperty("status")
    private String status;
    @JsonProperty("supplementprojectflg")
    private String supplementprojectflg;
    @JsonProperty("theme1")
    private Theme1 theme1;
    @JsonProperty("theme_namecode")
    private List<ThemeNamecode> themeNamecode = null;
    @JsonProperty("themecode")
    private String themecode;
    @JsonProperty("totalamt")
    private Integer totalamt;
    @JsonProperty("totalcommamt")
    private Integer totalcommamt;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5756956779924156720L;

    @JsonProperty("approvalfy")
    public Integer getApprovalfy() {
        return approvalfy;
    }

    @JsonProperty("approvalfy")
    public void setApprovalfy(Integer approvalfy) {
        this.approvalfy = approvalfy;
    }

    @JsonProperty("board_approval_month")
    public String getBoardApprovalMonth() {
        return boardApprovalMonth;
    }

    @JsonProperty("board_approval_month")
    public void setBoardApprovalMonth(String boardApprovalMonth) {
        this.boardApprovalMonth = boardApprovalMonth;
    }

    @JsonProperty("boardapprovaldate")
    public String getBoardapprovaldate() {
        return boardapprovaldate;
    }

    @JsonProperty("boardapprovaldate")
    public void setBoardapprovaldate(String boardapprovaldate) {
        this.boardapprovaldate = boardapprovaldate;
    }

    @JsonProperty("borrower")
    public String getBorrower() {
        return borrower;
    }

    @JsonProperty("borrower")
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @JsonProperty("closingdate")
    public String getClosingdate() {
        return closingdate;
    }

    @JsonProperty("closingdate")
    public void setClosingdate(String closingdate) {
        this.closingdate = closingdate;
    }

    @JsonProperty("country_namecode")
    public String getCountryNamecode() {
        return countryNamecode;
    }

    @JsonProperty("country_namecode")
    public void setCountryNamecode(String countryNamecode) {
        this.countryNamecode = countryNamecode;
    }

    @JsonProperty("countrycode")
    public String getCountrycode() {
        return countrycode;
    }

    @JsonProperty("countrycode")
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @JsonProperty("countryname")
    public String getCountryname() {
        return countryname;
    }

    @JsonProperty("countryname")
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    @JsonProperty("countryshortname")
    public String getCountryshortname() {
        return countryshortname;
    }

    @JsonProperty("countryshortname")
    public void setCountryshortname(String countryshortname) {
        this.countryshortname = countryshortname;
    }

    @JsonProperty("docty")
    public String getDocty() {
        return docty;
    }

    @JsonProperty("docty")
    public void setDocty(String docty) {
        this.docty = docty;
    }

    @JsonProperty("envassesmentcategorycode")
    public String getEnvassesmentcategorycode() {
        return envassesmentcategorycode;
    }

    @JsonProperty("envassesmentcategorycode")
    public void setEnvassesmentcategorycode(String envassesmentcategorycode) {
        this.envassesmentcategorycode = envassesmentcategorycode;
    }

    @JsonProperty("grantamt")
    public Integer getGrantamt() {
        return grantamt;
    }

    @JsonProperty("grantamt")
    public void setGrantamt(Integer grantamt) {
        this.grantamt = grantamt;
    }

    @JsonProperty("ibrdcommamt")
    public Integer getIbrdcommamt() {
        return ibrdcommamt;
    }

    @JsonProperty("ibrdcommamt")
    public void setIbrdcommamt(Integer ibrdcommamt) {
        this.ibrdcommamt = ibrdcommamt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("idacommamt")
    public Integer getIdacommamt() {
        return idacommamt;
    }

    @JsonProperty("idacommamt")
    public void setIdacommamt(Integer idacommamt) {
        this.idacommamt = idacommamt;
    }

    @JsonProperty("impagency")
    public String getImpagency() {
        return impagency;
    }

    @JsonProperty("impagency")
    public void setImpagency(String impagency) {
        this.impagency = impagency;
    }

    @JsonProperty("lendinginstr")
    public String getLendinginstr() {
        return lendinginstr;
    }

    @JsonProperty("lendinginstr")
    public void setLendinginstr(String lendinginstr) {
        this.lendinginstr = lendinginstr;
    }

    @JsonProperty("lendinginstrtype")
    public String getLendinginstrtype() {
        return lendinginstrtype;
    }

    @JsonProperty("lendinginstrtype")
    public void setLendinginstrtype(String lendinginstrtype) {
        this.lendinginstrtype = lendinginstrtype;
    }

    @JsonProperty("lendprojectcost")
    public Long getLendprojectcost() {
        return lendprojectcost;
    }

    @JsonProperty("lendprojectcost")
    public void setLendprojectcost(Long lendprojectcost) {
        this.lendprojectcost = lendprojectcost;
    }

    @JsonProperty("majorsector_percent")
    public List<MajorsectorPercent> getMajorsectorPercent() {
        return majorsectorPercent;
    }

    @JsonProperty("majorsector_percent")
    public void setMajorsectorPercent(List<MajorsectorPercent> majorsectorPercent) {
        this.majorsectorPercent = majorsectorPercent;
    }

    @JsonProperty("mjsector_namecode")
    public List<MjsectorNamecode> getMjsectorNamecode() {
        return mjsectorNamecode;
    }

    @JsonProperty("mjsector_namecode")
    public void setMjsectorNamecode(List<MjsectorNamecode> mjsectorNamecode) {
        this.mjsectorNamecode = mjsectorNamecode;
    }

    @JsonProperty("mjtheme")
    public List<String> getMjtheme() {
        return mjtheme;
    }

    @JsonProperty("mjtheme")
    public void setMjtheme(List<String> mjtheme) {
        this.mjtheme = mjtheme;
    }

    @JsonProperty("mjtheme_namecode")
    public List<MjthemeNamecode> getMjthemeNamecode() {
        return mjthemeNamecode;
    }

    @JsonProperty("mjtheme_namecode")
    public void setMjthemeNamecode(List<MjthemeNamecode> mjthemeNamecode) {
        this.mjthemeNamecode = mjthemeNamecode;
    }

    @JsonProperty("mjthemecode")
    public String getMjthemecode() {
        return mjthemecode;
    }

    @JsonProperty("mjthemecode")
    public void setMjthemecode(String mjthemecode) {
        this.mjthemecode = mjthemecode;
    }

    @JsonProperty("prodline")
    public String getProdline() {
        return prodline;
    }

    @JsonProperty("prodline")
    public void setProdline(String prodline) {
        this.prodline = prodline;
    }

    @JsonProperty("prodlinetext")
    public String getProdlinetext() {
        return prodlinetext;
    }

    @JsonProperty("prodlinetext")
    public void setProdlinetext(String prodlinetext) {
        this.prodlinetext = prodlinetext;
    }

    @JsonProperty("productlinetype")
    public String getProductlinetype() {
        return productlinetype;
    }

    @JsonProperty("productlinetype")
    public void setProductlinetype(String productlinetype) {
        this.productlinetype = productlinetype;
    }

    @JsonProperty("project_abstract")
    public ProjectAbstract getProjectAbstract() {
        return projectAbstract;
    }

    @JsonProperty("project_abstract")
    public void setProjectAbstract(ProjectAbstract projectAbstract) {
        this.projectAbstract = projectAbstract;
    }

    @JsonProperty("project_name")
    public String getProjectName() {
        return projectName;
    }

    @JsonProperty("project_name")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @JsonProperty("projectdocs")
    public List<Projectdoc> getProjectdocs() {
        return projectdocs;
    }

    @JsonProperty("projectdocs")
    public void setProjectdocs(List<Projectdoc> projectdocs) {
        this.projectdocs = projectdocs;
    }

    @JsonProperty("projectfinancialtype")
    public String getProjectfinancialtype() {
        return projectfinancialtype;
    }

    @JsonProperty("projectfinancialtype")
    public void setProjectfinancialtype(String projectfinancialtype) {
        this.projectfinancialtype = projectfinancialtype;
    }

    @JsonProperty("projectstatusdisplay")
    public String getProjectstatusdisplay() {
        return projectstatusdisplay;
    }

    @JsonProperty("projectstatusdisplay")
    public void setProjectstatusdisplay(String projectstatusdisplay) {
        this.projectstatusdisplay = projectstatusdisplay;
    }

    @JsonProperty("regionname")
    public String getRegionname() {
        return regionname;
    }

    @JsonProperty("regionname")
    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    @JsonProperty("sector")
    public List<Sector> getSector() {
        return sector;
    }

    @JsonProperty("sector")
    public void setSector(List<Sector> sector) {
        this.sector = sector;
    }

    @JsonProperty("sector1")
    public Sector1 getSector1() {
        return sector1;
    }

    @JsonProperty("sector1")
    public void setSector1(Sector1 sector1) {
        this.sector1 = sector1;
    }

    @JsonProperty("sector2")
    public Sector2 getSector2() {
        return sector2;
    }

    @JsonProperty("sector2")
    public void setSector2(Sector2 sector2) {
        this.sector2 = sector2;
    }

    @JsonProperty("sector3")
    public Sector3 getSector3() {
        return sector3;
    }

    @JsonProperty("sector3")
    public void setSector3(Sector3 sector3) {
        this.sector3 = sector3;
    }

    @JsonProperty("sector4")
    public Sector4 getSector4() {
        return sector4;
    }

    @JsonProperty("sector4")
    public void setSector4(Sector4 sector4) {
        this.sector4 = sector4;
    }

    @JsonProperty("sector_namecode")
    public List<SectorNamecode> getSectorNamecode() {
        return sectorNamecode;
    }

    @JsonProperty("sector_namecode")
    public void setSectorNamecode(List<SectorNamecode> sectorNamecode) {
        this.sectorNamecode = sectorNamecode;
    }

    @JsonProperty("sectorcode")
    public String getSectorcode() {
        return sectorcode;
    }

    @JsonProperty("sectorcode")
    public void setSectorcode(String sectorcode) {
        this.sectorcode = sectorcode;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("supplementprojectflg")
    public String getSupplementprojectflg() {
        return supplementprojectflg;
    }

    @JsonProperty("supplementprojectflg")
    public void setSupplementprojectflg(String supplementprojectflg) {
        this.supplementprojectflg = supplementprojectflg;
    }

    @JsonProperty("theme1")
    public Theme1 getTheme1() {
        return theme1;
    }

    @JsonProperty("theme1")
    public void setTheme1(Theme1 theme1) {
        this.theme1 = theme1;
    }

    @JsonProperty("theme_namecode")
    public List<ThemeNamecode> getThemeNamecode() {
        return themeNamecode;
    }

    @JsonProperty("theme_namecode")
    public void setThemeNamecode(List<ThemeNamecode> themeNamecode) {
        this.themeNamecode = themeNamecode;
    }

    @JsonProperty("themecode")
    public String getThemecode() {
        return themecode;
    }

    @JsonProperty("themecode")
    public void setThemecode(String themecode) {
        this.themecode = themecode;
    }

    @JsonProperty("totalamt")
    public Integer getTotalamt() {
        return totalamt;
    }

    @JsonProperty("totalamt")
    public void setTotalamt(Integer totalamt) {
        this.totalamt = totalamt;
    }

    @JsonProperty("totalcommamt")
    public Integer getTotalcommamt() {
        return totalcommamt;
    }

    @JsonProperty("totalcommamt")
    public void setTotalcommamt(Integer totalcommamt) {
        this.totalcommamt = totalcommamt;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
