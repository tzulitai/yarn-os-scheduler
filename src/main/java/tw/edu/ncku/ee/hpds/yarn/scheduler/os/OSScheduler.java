package tw.edu.ncku.ee.hpds.yarn.scheduler.os;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.yarn.api.records.ApplicationAttemptId;
import org.apache.hadoop.yarn.api.records.ContainerId;
import org.apache.hadoop.yarn.api.records.NodeId;
import org.apache.hadoop.yarn.api.records.QueueACL;
import org.apache.hadoop.yarn.api.records.QueueInfo;
import org.apache.hadoop.yarn.api.records.QueueUserACLInfo;
import org.apache.hadoop.yarn.api.records.Resource;
import org.apache.hadoop.yarn.api.records.ResourceRequest;
import org.apache.hadoop.yarn.server.resourcemanager.RMContext;
import org.apache.hadoop.yarn.server.resourcemanager.recovery.RMStateStore.RMState;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.Allocation;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.QueueMetrics;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.ResourceScheduler;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.SchedulerAppReport;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.SchedulerNodeReport;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.event.SchedulerEvent;

public class OSScheduler implements ResourceScheduler {

	public Allocation allocate(ApplicationAttemptId arg0,
			List<ResourceRequest> arg1, List<ContainerId> arg2,
			List<String> arg3, List<String> arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean checkAccess(UserGroupInformation arg0, QueueACL arg1,
			String arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	public Resource getMaximumResourceCapability() {
		// TODO Auto-generated method stub
		return null;
	}

	public Resource getMinimumResourceCapability() {
		// TODO Auto-generated method stub
		return null;
	}

	public SchedulerNodeReport getNodeReport(NodeId arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumClusterNodes() {
		// TODO Auto-generated method stub
		return 0;
	}

	public QueueInfo getQueueInfo(String arg0, boolean arg1, boolean arg2)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<QueueUserACLInfo> getQueueUserAclInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public QueueMetrics getRootQueueMetrics() {
		// TODO Auto-generated method stub
		return null;
	}

	public SchedulerAppReport getSchedulerAppInfo(ApplicationAttemptId arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void handle(SchedulerEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void recover(RMState arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void reinitialize(Configuration arg0, RMContext arg1)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

}
