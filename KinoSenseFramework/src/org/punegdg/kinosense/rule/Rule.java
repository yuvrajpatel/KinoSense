/**
 * Copyright 2012 Pune-GDG (http://meetup.com/pune-gdg)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.punegdg.kinosense.rule;

/**
 * @author saurabhg
 * 
 */
public class Rule
{

	/**
	 * Unique rule id for every rule
	 */
	private int ruleId;

	/**
	 * Trigger for this rule represented by corresponding trigger id
	 */
	private int triggerId;

	/**
	 * Action for this rule represented by corresponding action id
	 */
	private int actionId;

	/**
	 * Additional information for the rule, like phone number to send a msg, etc. This could be a JSON with name value
	 * pair.
	 */
	private String additionalInformation;


	/**
	 * @param ruleId
	 * @param triggerId
	 * @param actionId
	 * @param additionalInformation
	 */
	public Rule(int ruleId, int triggerId, int actionId, String additionalInformation)
	{
		super();
		this.ruleId = ruleId;
		this.triggerId = triggerId;
		this.actionId = actionId;
		this.additionalInformation = additionalInformation;
	}


	/**
	 * @return the ruleId
	 */
	public int getRuleId()
	{
		return this.ruleId;
	}


	/**
	 * @param ruleId the ruleId to set
	 */
	public void setRuleId(int ruleId)
	{
		this.ruleId = ruleId;
	}


	/**
	 * @return the triggerId
	 */
	public int getTriggerId()
	{
		return this.triggerId;
	}


	/**
	 * @param triggerId the triggerId to set
	 */
	public void setTriggerId(int triggerId)
	{
		this.triggerId = triggerId;
	}


	/**
	 * @return the actionId
	 */
	public int getActionId()
	{
		return this.actionId;
	}


	/**
	 * @param actionId the actionId to set
	 */
	public void setActionId(int actionId)
	{
		this.actionId = actionId;
	}


	/**
	 * @return the additionalInformation
	 */
	public String getAdditionalInformation()
	{
		return this.additionalInformation;
	}


	/**
	 * @param additionalInformation the additionalInformation to set
	 */
	public void setAdditionalInformation(String additionalInformation)
	{
		this.additionalInformation = additionalInformation;
	}

}
