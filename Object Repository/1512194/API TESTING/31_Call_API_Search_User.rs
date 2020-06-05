<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>31_Call_API_Search_User</name>
   <tag></tag>
   <elementGuidId>b9728ed6-5557-4593-b166-a0de37de9acc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;term\&quot;: \&quot;string\&quot;,\n  \&quot;team_id\&quot;: \&quot;string\&quot;,\n  \&quot;not_in_team_id\&quot;: \&quot;string\&quot;,\n  \&quot;in_channel_id\&quot;: \&quot;string\&quot;,\n  \&quot;not_in_channel_id\&quot;: \&quot;string\&quot;,\n  \&quot;group_constrained\&quot;: true,\n  \&quot;allow_inactive\&quot;: true,\n  \&quot;without_team\&quot;: true,\n  \&quot;limit\&quot;: 100\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>access-token</name>
      <type>Main</type>
      <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI1ZWI2N2EyNmUyZGVmYjM2ZTA0NDcyOTUiLCJ0eXBlIjoiYWRtaW4iLCJpYXQiOjE1OTA3NTkwOTUsImV4cCI6MTU5MDg0NTQ5NX0.Zai0jVKNMZLpUrte_SJWc5LHvQmdFkEs2yJcDfckvRA</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>MMAUTHTOKEN=7t18sz31yiympcjk96f5inqkih; MMUSERID=hhbx6spxp3gmfx8dfak7n4yw4o; MMCSRF=acw1314wqpyeic7fxoq8k58qqc</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-CSRF-Token</name>
      <type>Main</type>
      <value>acw1314wqpyeic7fxoq8k58qqc</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Requested-With</name>
      <type>Main</type>
      <value>XMLHttpRequest</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:8065/api/v4/users/search</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
