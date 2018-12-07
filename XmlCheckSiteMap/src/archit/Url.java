/*
 * Copyright (c) 2018 JCPenney Co. All rights reserved.
 */

package archit;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Url.
 *
 * @author abagora
 * @version 1.0 21-03-2018
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@JacksonXmlRootElement(localName = "url")
@JsonPropertyOrder( {"loc", "lastmod", "changefreq","priority"})
public class Url {

  private String loc;
  private String lastmod;
  private String changefreq;
  private Double priority;
}

