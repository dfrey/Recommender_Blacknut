/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package binder.config;

import org.slf4j.Logger;

public class BCNConfig implements AbstractConfig {
	
	private int level; /* Recursion level for neighborhood biclusters search */
	
	public void setLevel(int n) {
		this.level = n;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	@Override
	public void logConfig(Logger logger) {
		logger.info("BCN");
		logger.info("Level: {}", this.level);
	}

}
