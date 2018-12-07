/*
 * Copyright (c) 2018 JCPenney Co. All rights reserved.
 */

package archit;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Url.
 *
 * @author abagora
 * @version 1.0 21-03-2018
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "urlset")
public class UrlSet {


  @JacksonXmlProperty(localName = "xmlns", isAttribute = true)
  String xmlns;

  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "url")
  List<Url> url;
}
