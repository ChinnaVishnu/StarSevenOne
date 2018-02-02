package com.jocata.star.RunStar;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.jocata.star.Mis.Latest.BenchmarksReport;
import com.jocata.star.Mis.Latest.CaseDetailsReport;
import com.jocata.star.Mis.Latest.RuleSummereyReport;
import com.jocata.star.Mis.Latest.UserCaseDetailsReport;
import com.jocata.star.existingfuctions.AddBenchMarkReportsChanges2;
import com.jocata.star.existingfuctions.AddruleChangesFuctionaltiy;
import com.jocata.star.existingfuctions.AdvancedAddBenchMark;
import com.jocata.star.exportexcels.CustomerPeerProfile;
import com.jocata.star.exportexcels.DashboardTask;
import com.jocata.star.exportexcels.NetworkExportGraph;
import com.jocata.star.exportexcels.TrancastionRulePopUpExport;
import com.jocata.star.grid.ADDRolesModify;
import com.jocata.star.grid.GridAddReport2;
import com.jocata.star.grid.IncludingPermissions2;
import com.jocata.star.misreports.AddBenchMarkBenchMarkRun;
import com.jocata.star.misreports.AddReportCaseDetailsReport;
import com.jocata.star.misreports.AddReportDashboard;
import com.jocata.star.misreports.AddReportEventDetailsReport;
import com.jocata.star.misreports.AddReportRuleSummary;
import com.jocata.star.misreports.AddReportUserCaseDetailsReport;
import com.jocata.star.misreports.AddReportsBenchMark;
import com.jocata.star.misreports.Extraction.RuleSummeryReportExtraction;
import com.jocata.star.misreports.Extraction.UserDetailsReportExtraction;
import com.jocata.star.misreports.excatpdf.AddReportCaseDetailsReportsLatest;
import com.jocata.star.misreports.excatpdf.AddReportUserCaseDetailsReportLatest;
import com.jocata.star.misreports.excatpdf.UsercaseDetailsReport2;
import com.jocata.star.misreports.excatpdf.caseDetailsReport3;
import com.jocata.star.reportsdownload.MisReportsDownload;
import com.jocata.star.screens.CustomerDetailsProfile;
import com.jocata.star.screens.ExclusionList;
import com.jocata.star.screens.FalsePositiveManager;
import com.jocata.star.scripts.AddBenchMarkJocata;
import com.jocata.star.scripts.AdvanceSearchJocataSe;
import com.jocata.star.scripts.CustomerFieldsJocata;
import com.jocata.star.scripts.NewCreateRuleJocata;
import com.jocata.star.scripts.SimpleSearchJocata;
import com.jocata.star.scripts.StarCase7Jocata;
import com.jocata.star.scripts.StarCase8Jocata;
import com.jocata.star.scripts.StarNavigationJocata;
import com.jocata.star.workflow.RiseSTR;
import com.jocata.star.workflow.RiseSTR2;
import com.jocata.star.workflow.RiseSTR3;
import com.jocata.star.workflow.WorkFLowActionsReassign;
import com.jocata.star.workflow.WorkFLowAndDispActions;
import com.jocata.star.workflow.WorkFLowFalsePositive;
import com.jocata.star.workflow.WorkFllowActionSuggestFalsePostive;
import com.jocata.star.workflow.WorkFlowActionsForWard;
import com.jocata.star.workflow.WorkFlowClose;
import com.jocata.star.workflow.WorkFlowRaiseSTR;





public class AllStarNewSevenone3 {

	public static void main(String[] args) {
		

	 TestListenerAdapter tla = new TestListenerAdapter();
	    TestNG testng = new TestNG();
	     Class[] classes = new Class[]{
	    		 
	    		 
	    		 UserCaseDetailsReport.class,
	    		 RuleSummereyReport.class,
	    		 CaseDetailsReport.class,
	    		 BenchmarksReport.class
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	   		 
//					AddBenchMarkBenchMarkRun.class, AddReportCaseDetailsReportsLatest.class, AddReportDashboard.class,
//					AddReportEventDetailsReport.class, AddReportRuleSummary.class, AddReportsBenchMark.class,
//					AddReportUserCaseDetailsReportLatest.class,

				//	MisReportsDownload.class,
					
					/*UsercaseDetailsReport2.class,
					caseDetailsReport3.class*/
					
	    		//.............................StarTestScripts...........................................// 
	    		 
	    		
	    		 
	    		 //...............................WorkFlow Actions....................................//
	    		 
	    		 
	    		// WorkFlowClose.class,//pass
	    		 
	    		 
	    		 
	    		// WorkFLowFalsePositive.class,//skipping
	    		 //WorkFlowRaiseSTR.class,//skipping
	    		 
	    		/* RiseSTR3.class,
	    		 WorkFlowActionsForWard.class,//pass
	    		*/// WorkFllowActionSuggestFalsePostive.class,//skipping
	    		 
	    		 
	    		 
	    		 //TrancastionRulePopUpExport.class,//pass
	    		// WorkFLowActionsReassign.class,//pass
	    		
	    		 
	    		 //...........................Add Reports.............................................//
	    		 
	    	    
	    		
	    		 
	           
	             };
	     testng.setTestClasses(classes);
	     testng.addListener(tla);
	     testng.run();
	    }	
	
}
