/*
 *
 *    Copyright (c) 2023 Project CHIP Authors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package matter.devicecontroller.cluster.clusters

import java.util.ArrayList

class ActivatedCarbonFilterMonitoringCluster(private val endpointId: UShort) {
  companion object {
    const val CLUSTER_ID: UInt = 114u
  }

  fun resetCondition(callback: DefaultClusterCallback) {
    // Implementation needs to be added here
  }

  fun resetCondition(callback: DefaultClusterCallback, timedInvokeTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  interface LastChangedTimeAttributeCallback {
    fun onSuccess(value: Long?)

    fun onError(ex: Exception)

    fun onSubscriptionEstablished(subscriptionId: Long)
  }

  interface ReplacementProductListAttributeCallback {
    fun onSuccess(
      value: ArrayList<ChipStructs.ActivatedCarbonFilterMonitoringClusterReplacementProductStruct>?
    )

    fun onError(ex: Exception)

    fun onSubscriptionEstablished(subscriptionId: Long)
  }

  interface GeneratedCommandListAttributeCallback {
    fun onSuccess(value: ArrayList<Long>)

    fun onError(ex: Exception)

    fun onSubscriptionEstablished(subscriptionId: Long)
  }

  interface AcceptedCommandListAttributeCallback {
    fun onSuccess(value: ArrayList<Long>)

    fun onError(ex: Exception)

    fun onSubscriptionEstablished(subscriptionId: Long)
  }

  interface EventListAttributeCallback {
    fun onSuccess(value: ArrayList<Long>)

    fun onError(ex: Exception)

    fun onSubscriptionEstablished(subscriptionId: Long)
  }

  interface AttributeListAttributeCallback {
    fun onSuccess(value: ArrayList<Long>)

    fun onError(ex: Exception)

    fun onSubscriptionEstablished(subscriptionId: Long)
  }

  fun readConditionAttribute(callback: IntegerAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeConditionAttribute(
    callback: IntegerAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readDegradationDirectionAttribute(callback: IntegerAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeDegradationDirectionAttribute(
    callback: IntegerAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readChangeIndicationAttribute(callback: IntegerAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeChangeIndicationAttribute(
    callback: IntegerAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readInPlaceIndicatorAttribute(callback: BooleanAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeInPlaceIndicatorAttribute(
    callback: BooleanAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readLastChangedTimeAttribute(callback: LastChangedTimeAttributeCallback) {
    // Implementation needs to be added here
  }

  fun writeLastChangedTimeAttribute(callback: DefaultClusterCallback, value: Long) {
    // Implementation needs to be added here
  }

  fun writeLastChangedTimeAttribute(
    callback: DefaultClusterCallback,
    value: Long,
    timedWriteTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  fun subscribeLastChangedTimeAttribute(
    callback: LastChangedTimeAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readReplacementProductListAttribute(callback: ReplacementProductListAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeReplacementProductListAttribute(
    callback: ReplacementProductListAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readGeneratedCommandListAttribute(callback: GeneratedCommandListAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeGeneratedCommandListAttribute(
    callback: GeneratedCommandListAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readAcceptedCommandListAttribute(callback: AcceptedCommandListAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeAcceptedCommandListAttribute(
    callback: AcceptedCommandListAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readEventListAttribute(callback: EventListAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeEventListAttribute(
    callback: EventListAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readAttributeListAttribute(callback: AttributeListAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeAttributeListAttribute(
    callback: AttributeListAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readFeatureMapAttribute(callback: LongAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeFeatureMapAttribute(
    callback: LongAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }

  fun readClusterRevisionAttribute(callback: IntegerAttributeCallback) {
    // Implementation needs to be added here
  }

  fun subscribeClusterRevisionAttribute(
    callback: IntegerAttributeCallback,
    minInterval: Int,
    maxInterval: Int
  ) {
    // Implementation needs to be added here
  }
}