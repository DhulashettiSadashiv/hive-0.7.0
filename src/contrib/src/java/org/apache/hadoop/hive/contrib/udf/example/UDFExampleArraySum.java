/*!
* Copyright 2010 - 2013 Pentaho Corporation.  All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package org.apache.hadoop.hive.contrib.udf.example;

import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * UDFExampleArraySum.
 *
 */
public class UDFExampleArraySum extends UDF {

  public Double evaluate(List<Double> a) {
    if (a == null) {
      return null;
    }
    double total = 0;
    for (int i = 0; i < a.size(); i++) {
      Double e = a.get(i);
      if (e != null) {
        total += e;
      }
    }
    return total;
  }

}
