package cn.edu.buaa.act.bstar.prover;
import java.util.Map;
import java.util.TreeMap;

import org.umbrella.MapWatcher.MapWatcher;

import cn.edu.buaa.act.bstar.environment.BStarEnvironment;
import cn.edu.buaa.act.bstar.quaternion.CQuaTreeNode;


public class BStarProver {

	public static void main(String[] args) {
		BStarEnvironment cur_evt = new BStarEnvironment("bs/Test01.bs");
		cur_evt.start_debug_console();
		cur_evt.generate_environment();
		CQuaTreeNode qua_root_node = cur_evt.get_qua_tree_root();
		//MapWatcher watcher = new MapWatcher(qua_root_node, "qua_root_node");
		//watcher.swing_ui_watcher();
		TreeMap<String, CQuaTreeNode> qua_node_map = cur_evt.get_qua_node_list();
		for(Map.Entry<String, CQuaTreeNode> cur_entry: qua_node_map.entrySet()){
			cur_entry.getValue().print_quas();
		}
	}
}
