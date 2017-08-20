/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

	private boolean printStatus = false;
	private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

	public UrlValidatorTest(String testName) {
		super(testName);
	}

   
   
	public void testManualTest()
	{
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
		System.out.println("http://www.amazon.com");
		System.out.println(urlVal.isValid("http://www.amazon.com"));

		System.out.println("http://amazon.com");
		System.out.println(urlVal.isValid("http://amazon.com"));

		System.out.println("www.amazon.com");
		System.out.println(urlVal.isValid("www.amazon.com"));

		System.out.println("amazon.com");
		System.out.println(urlVal.isValid("amazon.com"));

		System.out.println("htt://www.amazon.com");
		System.out.println(urlVal.isValid("htt://www.amazon.com"));

		System.out.println("http://ww.amazon.com");
		System.out.println(urlVal.isValid("http://ww.amazon.com"));

		System.out.println("http://www.amazon.om");
		System.out.println(urlVal.isValid("http://www.amazon.om"));

		System.out.println("http://www.amazon.com/");
		System.out.println(urlVal.isValid("http://www.amazon.com/"));

		System.out.println("http://www.amazon.com/dir1/file2/");
		System.out.println(urlVal.isValid("http://www.amazon.com/dir1/file2/"));

		System.out.println("http://www.amazon.com/dir1//file2/");
		System.out.println(urlVal.isValid("http://www.amazon.com/dir1//file2/"));

		System.out.println("https://www.amazon.com");
		System.out.println(urlVal.isValid("https://www.amazon.com"));

		System.out.println("http://www.amazon.edu");
		System.out.println(urlVal.isValid("http://www.amazon.edu"));

		System.out.println("185.231.78.101");
		System.out.println(urlVal.isValid("185.231.78.101"));

		System.out.println("http://www.amazon.com/:57386");
		System.out.println(urlVal.isValid("http://www.amazon.com/:57386"));

		System.out.println("http://www.amazon.com?action=view");
		System.out.println(urlVal.isValid("http://www.amazon.com?action=view"));
		   
	}
   
   
	public void testYourFirstPartition()
	{
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

		System.out.println("First Partition: All elements correct.");

		System.out.println(urlVal.isValid("http://www.google.com/"));

		System.out.println(urlVal.isValid("www.google.com"));

		System.out.println(urlVal.isValid("google.com"));

		System.out.println(urlVal.isValid("https://www.google.com"));

		System.out.println(urlVal.isValid("http://www.google.com/dir1/file2/"));

		System.out.println(urlVal.isValid("http://www.google.com/:57881"));

		System.out.println(urlVal.isValid("http://www.google.com?action=view"));
	}
   
	public void testYourSecondPartition()
	{
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

		System.out.println("Second Partition: One element incorrect.");

		System.out.println(urlVal.isValid("htt://www.google.com"));

		System.out.println(urlVal.isValid("http://ww.google.com"));

		System.out.println(urlVal.isValid("http://www.google.com/:354ab"));

		System.out.println(urlVal.isValid("http://www.google.com/../"));

		System.out.println(urlVal.isValid("http://www.google.com/?"));
	}

	public void testYourThirdPartition()
	{
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

		System.out.println("Third Partition: More than one element incorrect.");

		System.out.println(urlVal.isValid("htt://www.youtube.om/"));

		System.out.println(urlVal.isValid("htt://www.google.com/dir1/../?action=view"));

		System.out.println(urlVal.isValid("htt://www.google.com/dir1/file1/?"));

		System.out.println(urlVal.isValid("https://ww.google.com/../?action=view"));

		System.out.println(urlVal.isValid("http://ww.google.com/dir1/?"));

		System.out.println(urlVal.isValid("http://google.com/dir1/../?"));

		System.out.println(urlVal.isValid("http://www.google.com/:34a/../"));
	}

	public void testYourFourthPartition()
	{
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

		System.out.println("Fourth Partition: All elements incorrect.");

		System.out.println(urlVal.isValid("://ww.youtube.com/../?"));

		System.out.println(urlVal.isValid("htt://www.youtube.om/dir1//../?"));

		System.out.println(urlVal.isValid("htp://ww.youtube.com/:734ba/..//"));

		System.out.println(urlVal.isValid("youtube.om/"));
	}
   
	public void testIsValid()
	{
		testIsValid(testUrlParts, UrlValidator.ALLOW_ALL_SCHEMES);
	}

	public void testIsValid(Object[] testObjects, long options)
	{
		UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
		ResultPair[] part1 = (ResultPair[]) testObjects[0];
		ResultPair[] part2 = (ResultPair[]) testObjects[1];
		ResultPair[] part3 = (ResultPair[]) testObjects[2];
		ResultPair[] part4 = (ResultPair[]) testObjects[3];
		ResultPair[] part5 = (ResultPair[]) testObjects[4];
		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j < part2.length; j++){
				for(int k = 0; k < part3.length; k++){
					for(int m = 0; m < part4.length; m++){
						for(int n = 0; n < part5.length; n++){
							StringBuffer testBuffer = new StringBuffer();
							testBuffer.append(part1[i].item);
							testBuffer.append(part2[j].item);
							testBuffer.append(part3[k].item);
							testBuffer.append(part4[m].item);
							testBuffer.append(part5[n].item);
							String url = testBuffer.toString();
							System.out.println(url);
							System.out.println(urlVal.isValid(url));
							if(part1[i].valid == true && part2[j].valid == true && part3[k].valid == true && part4[m].valid == true && part5[n].valid == true){
								assertTrue(urlVal.isValid(url));
							}
							else{
								assertFalse(urlVal.isValid(url));
							}
						}
					}
				}
			}
		}
	}

	public void testAnyOtherUnitTest()
	{
		   
	}
	/**
	 * Create set of tests by taking the testUrlXXX arrays and
	 * running through all possible permutations of their combinations.
	 *
	 * @param testObjects Used to create a url.
	 */

	ResultPair[] testUrlScheme = {new ResultPair("http://", true),
								  new ResultPair("ftp://", true),
								  new ResultPair("h3t://", true),
								  new ResultPair("3ht://", false),
								  new ResultPair("http:/", false),
								  new ResultPair("http:", false),
								  new ResultPair("http/", false),
								  new ResultPair("://", false),
								  new ResultPair("", true)};

    ResultPair[] testUrlAuthority = {new ResultPair("www.google.com", true),
									 new ResultPair("go.com", true),
									 new ResultPair("go.au", true),
									 new ResultPair("0.0.0.0", true),
									 new ResultPair("255.255.255.255", true),
									 new ResultPair("256.256.256.256", false),
									 new ResultPair("255.com", true),
									 new ResultPair("1.2.3.4.5", false),
									 new ResultPair("1.2.3.4.", false),
									 new ResultPair("1.2.3", false),
									 new ResultPair(".1.2.3.4", false),
									 new ResultPair("go.a", false),
									 new ResultPair("go.a1a", false),
									 new ResultPair("go.cc", true),
									 new ResultPair("go.1aa", false),
									 new ResultPair("aaa.", false),
									 new ResultPair(".aaa", false),
									 new ResultPair("aaa", false),
									 new ResultPair("", false)
    };
    ResultPair[] testUrlPort = {new ResultPair(":80", true),
								new ResultPair(":65535", true),
								new ResultPair(":0", true),
								new ResultPair("", true),
								new ResultPair(":-1", false),
								new ResultPair(":65636", true),
								new ResultPair(":65a", false)
    };
    ResultPair[] testPath = {new ResultPair("/test1", true),
							 new ResultPair("/t123", true),
							 new ResultPair("/$23", true),
							 new ResultPair("/..", false),
							 new ResultPair("/../", false),
							 new ResultPair("/test1/", true),
							 new ResultPair("", true),
							 new ResultPair("/test1/file", true),
							 new ResultPair("/..//file", false),
							 new ResultPair("/test1//file", false)
    };
    //Test allow2slash, noFragment
    ResultPair[] testUrlPathOptions = {new ResultPair("/test1", true),
									   new ResultPair("/t123", true),
									   new ResultPair("/$23", true),
									   new ResultPair("/..", false),
									   new ResultPair("/../", false),
									   new ResultPair("/test1/", true),
									   new ResultPair("/#", false),
									   new ResultPair("", true),
									   new ResultPair("/test1/file", true),
									   new ResultPair("/t123/file", true),
									   new ResultPair("/$23/file", true),
									   new ResultPair("/../file", false),
									   new ResultPair("/..//file", false),
									   new ResultPair("/test1//file", true),
									   new ResultPair("/#/file", false)
    };

    ResultPair[] testUrlQuery = {new ResultPair("?action=view", true),
								 new ResultPair("?action=edit&mode=up", true),
								 new ResultPair("", true)
    };

    Object[] testUrlParts = {testUrlScheme, testUrlAuthority, testUrlPort, testPath, testUrlQuery};
    Object[] testUrlPartsOptions = {testUrlScheme, testUrlAuthority, testUrlPort, testUrlPathOptions, testUrlQuery};
    int[] testPartsIndex = {0, 0, 0, 0, 0};

    //---------------- Test data for individual url parts ----------------
    ResultPair[] testScheme = {new ResultPair("http", true),
							   new ResultPair("ftp", false),
							   new ResultPair("httpd", false),
							   new ResultPair("telnet", false)};

}
