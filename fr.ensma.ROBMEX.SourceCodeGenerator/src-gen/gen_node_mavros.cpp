
/* 
 * AUTOMATICALLY GENERATED FILE
 *		ROBMEX Framework
 * 
 * Node: mavros
 *
 * Communicates by MAVLink Protocol with ArduPilot and PixHawk the messages sent by ROS nodes
 *
 */

#include "ros/ros.h"

#include "geometry_msgs/Pose.h"
#include "mavros_msgs/ExtendedState.h"
#include "mavros_msgs/BatteryStatus.h"
#include "mavros_msgs/State.h"
#include "std_msgs/Float64.h"
#include "mavros_msgs/OverrideRCIn.h"

#include "mavros_msgs/CommandTOL.h"
#include "mavros_msgs/CommandHome.h"
#include "mavros_msgs/WaypointPull.h"
#include "mavros_msgs/CommandTriggerControl.h"
#include "mavros_msgs/CommandTOL.h"
#include "mavros_msgs/WaypointPush.h"
#include "mavros_msgs/ParamSet.h"
#include "mavros_msgs/WaypointClear.h"
#include "mavros_msgs/WaypointSetCurrent.h"
#include "mavros_msgs/CommandBool.h"

#include "mavros/gen_node_mavros_body.h"


// Callbacks to subscribed topics:

void callback_rc_override(const mavros_msgs::OverrideRCIn::ConstPtr& msg)
{
	// Code
}

void callback_setpoint_position_local(const geometry_msgs::Pose::ConstPtr& msg)
{
	// Code
}

void callback_global_position_rel_alt(const std_msgs::Float64::ConstPtr& msg)
{
	// Code
}


// Procedures remotely called by services:

bool serviceFunction_cmd_arming(mavros_msgs::CommandBool::Request& req,
mavros_msgs::CommandBool::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_cmd_set_home(mavros_msgs::CommandHome::Request& req,
mavros_msgs::CommandHome::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_cmd_takeoff(mavros_msgs::CommandTOL::Request& req,
mavros_msgs::CommandTOL::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_cmd_land(mavros_msgs::CommandTOL::Request& req,
mavros_msgs::CommandTOL::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_mission_pull(mavros_msgs::WaypointPull::Request& req,
mavros_msgs::WaypointPull::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_mission_push(mavros_msgs::WaypointPush::Request& req,
mavros_msgs::WaypointPush::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_mission_clear(mavros_msgs::WaypointClear::Request& req,
mavros_msgs::WaypointClear::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_mission_set_current(mavros_msgs::WaypointSetCurrent::Request& req,
mavros_msgs::WaypointSetCurrent::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_cmd_trigger_control(mavros_msgs::CommandTriggerControl::Request& req,
mavros_msgs::CommandTriggerControl::Response& res)
{
	// Code
	return true;
}

bool serviceFunction_param_set(mavros_msgs::ParamSet::Request& req,
mavros_msgs::ParamSet::Response& res)
{
	// Code
	return true;
}


int main(int argc, char** argv)
{
	ros::init(argc, argv, "mavros");
	ros::NodeHandle n;

	ros::Publisher pub_state = n.advertise<mavros_msgs::State>("state", 1);
	ros::Publisher pub_battery = n.advertise<mavros_msgs::BatteryStatus>("battery", 1);
	ros::Publisher pub_extended_state = n.advertise<mavros_msgs::ExtendedState>("extended_state", 1);
	ros::Publisher pub_global_position_rel_alt = n.advertise<std_msgs::Float64>("global_position/rel_alt", 1);

	ros::Subscriber subs_rc_override = n.subscribe("rc/override", 1, callback_rc_override);
	ros::Subscriber subs_setpoint_position_local = n.subscribe("setpoint_position/local", 1, callback_setpoint_position_local);
	ros::Subscriber subs_global_position_rel_alt = n.subscribe("global_position/rel_alt", 1, callback_global_position_rel_alt);
	
	ros::ServiceServer serv_cmd_arming = n.advertiseService("cmd/arming", serviceFunction_cmd_arming);
	ros::ServiceServer serv_cmd_set_home = n.advertiseService("cmd/set_home", serviceFunction_cmd_set_home);
	ros::ServiceServer serv_cmd_takeoff = n.advertiseService("cmd/takeoff", serviceFunction_cmd_takeoff);
	ros::ServiceServer serv_cmd_land = n.advertiseService("cmd/land", serviceFunction_cmd_land);
	ros::ServiceServer serv_mission_pull = n.advertiseService("mission/pull", serviceFunction_mission_pull);
	ros::ServiceServer serv_mission_push = n.advertiseService("mission/push", serviceFunction_mission_push);
	ros::ServiceServer serv_mission_clear = n.advertiseService("mission/clear", serviceFunction_mission_clear);
	ros::ServiceServer serv_mission_set_current = n.advertiseService("mission/set_current", serviceFunction_mission_set_current);
	ros::ServiceServer serv_cmd_trigger_control = n.advertiseService("cmd/trigger_control", serviceFunction_cmd_trigger_control);
	ros::ServiceServer serv_param_set = n.advertiseService("param/set", serviceFunction_param_set);

 
	while (ros::ok() && nodeAlive) {
		// Code
	}

	return 0;
}
