package dongfang.mavlink_10.serialization;
import dongfang.mavlink_10.messages.*;
import java.io.IOException;
public interface MavlinkMessageVisitor {
  void visit(HeartbeatMessage message) throws IOException;
  void visit(SysStatusMessage message) throws IOException;
  void visit(SystemTimeMessage message) throws IOException;
  void visit(PingMessage message) throws IOException;
  void visit(ChangeOperatorControlMessage message) throws IOException;
  void visit(ChangeOperatorControlAckMessage message) throws IOException;
  void visit(AuthKeyMessage message) throws IOException;
  void visit(SetModeMessage message) throws IOException;
  void visit(ParamRequestReadMessage message) throws IOException;
  void visit(ParamRequestListMessage message) throws IOException;
  void visit(ParamValueMessage message) throws IOException;
  void visit(ParamSetMessage message) throws IOException;
  void visit(GpsRawIntMessage message) throws IOException;
  void visit(GpsStatusMessage message) throws IOException;
  void visit(ScaledImuMessage message) throws IOException;
  void visit(RawImuMessage message) throws IOException;
  void visit(RawPressureMessage message) throws IOException;
  void visit(ScaledPressureMessage message) throws IOException;
  void visit(AttitudeMessage message) throws IOException;
  void visit(AttitudeQuaternionMessage message) throws IOException;
  void visit(LocalPositionNedMessage message) throws IOException;
  void visit(GlobalPositionIntMessage message) throws IOException;
  void visit(RcChannelsScaledMessage message) throws IOException;
  void visit(RcChannelsRawMessage message) throws IOException;
  void visit(ServoOutputRawMessage message) throws IOException;
  void visit(MissionRequestPartialListMessage message) throws IOException;
  void visit(MissionWritePartialListMessage message) throws IOException;
  void visit(MissionItemMessage message) throws IOException;
  void visit(MissionRequestMessage message) throws IOException;
  void visit(MissionSetCurrentMessage message) throws IOException;
  void visit(MissionCurrentMessage message) throws IOException;
  void visit(MissionRequestListMessage message) throws IOException;
  void visit(MissionCountMessage message) throws IOException;
  void visit(MissionClearAllMessage message) throws IOException;
  void visit(MissionItemReachedMessage message) throws IOException;
  void visit(MissionAckMessage message) throws IOException;
  void visit(SetGpsGlobalOriginMessage message) throws IOException;
  void visit(GpsGlobalOriginMessage message) throws IOException;
  void visit(SetLocalPositionSetpointMessage message) throws IOException;
  void visit(LocalPositionSetpointMessage message) throws IOException;
  void visit(GlobalPositionSetpointIntMessage message) throws IOException;
  void visit(SetGlobalPositionSetpointIntMessage message) throws IOException;
  void visit(SafetySetAllowedAreaMessage message) throws IOException;
  void visit(SafetyAllowedAreaMessage message) throws IOException;
  void visit(SetRollPitchYawThrustMessage message) throws IOException;
  void visit(SetRollPitchYawSpeedThrustMessage message) throws IOException;
  void visit(RollPitchYawThrustSetpointMessage message) throws IOException;
  void visit(RollPitchYawSpeedThrustSetpointMessage message) throws IOException;
  void visit(SetQuadMotorsSetpointMessage message) throws IOException;
  void visit(SetQuadSwarmRollPitchYawThrustMessage message) throws IOException;
  void visit(NavControllerOutputMessage message) throws IOException;
  void visit(SetQuadSwarmLedRollPitchYawThrustMessage message) throws IOException;
  void visit(StateCorrectionMessage message) throws IOException;
  void visit(RequestDataStreamMessage message) throws IOException;
  void visit(DataStreamMessage message) throws IOException;
  void visit(ManualControlMessage message) throws IOException;
  void visit(RcChannelsOverrideMessage message) throws IOException;
  void visit(VfrHudMessage message) throws IOException;
  void visit(CommandLongMessage message) throws IOException;
  void visit(CommandAckMessage message) throws IOException;
  void visit(LocalPositionNedSystemGlobalOffsetMessage message) throws IOException;
  void visit(HilStateMessage message) throws IOException;
  void visit(HilControlsMessage message) throws IOException;
  void visit(HilRcInputsRawMessage message) throws IOException;
  void visit(OpticalFlowMessage message) throws IOException;
  void visit(GlobalVisionPositionEstimateMessage message) throws IOException;
  void visit(VisionPositionEstimateMessage message) throws IOException;
  void visit(VisionSpeedEstimateMessage message) throws IOException;
  void visit(ViconPositionEstimateMessage message) throws IOException;
  void visit(HighresImuMessage message) throws IOException;
  void visit(BatteryStatusMessage message) throws IOException;
  void visit(Setpoint8dofMessage message) throws IOException;
  void visit(Setpoint6dofMessage message) throws IOException;
  void visit(MemoryVectMessage message) throws IOException;
  void visit(DebugVectMessage message) throws IOException;
  void visit(NamedValueFloatMessage message) throws IOException;
  void visit(NamedValueIntMessage message) throws IOException;
  void visit(StatustextMessage message) throws IOException;
  void visit(DebugMessage message) throws IOException;
  void visit(SensorOffsetsMessage message) throws IOException;
  void visit(SetMagOffsetsMessage message) throws IOException;
  void visit(MeminfoMessage message) throws IOException;
  void visit(ApAdcMessage message) throws IOException;
  void visit(DigicamConfigureMessage message) throws IOException;
  void visit(DigicamControlMessage message) throws IOException;
  void visit(MountConfigureMessage message) throws IOException;
  void visit(MountControlMessage message) throws IOException;
  void visit(MountStatusMessage message) throws IOException;
  void visit(FencePointMessage message) throws IOException;
  void visit(FenceFetchPointMessage message) throws IOException;
  void visit(FenceStatusMessage message) throws IOException;
  void visit(AhrsMessage message) throws IOException;
  void visit(SimstateMessage message) throws IOException;
  void visit(HwstatusMessage message) throws IOException;
  void visit(RadioMessage message) throws IOException;
  void visit(LimitsStatusMessage message) throws IOException;
  void visit(WindMessage message) throws IOException;
  void visit(Data16Message message) throws IOException;
  void visit(Data32Message message) throws IOException;
  void visit(Data64Message message) throws IOException;
  void visit(Data96Message message) throws IOException;
}