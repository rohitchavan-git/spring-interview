package spring.rohit.propertyConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello.message")
public class HelloPropertyConfig {

	/**
	 * Give your prefix
	 */
	private String prefix;
	/**
	 * Give your Postfix
	 */
	private String postfix;

	public String getPrefix() {
		return prefix;
	}

	public String getPostfix() {
		return postfix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}

	@Override
	public String toString() {
		return "HelloPropertyConfig [prefix=" + prefix + ", postfix=" + postfix + "]";
	}

}
