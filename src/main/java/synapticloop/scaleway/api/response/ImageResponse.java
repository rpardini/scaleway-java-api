package synapticloop.scaleway.api.response;

/*
 * Copyright (c) 2016-2017 synapticloop.
 * 
 * All rights reserved.
 * 
 * This code may contain contributions from other parties which, where 
 * applicable, will be listed in the default build file for the project 
 * ~and/or~ in a file named CONTRIBUTORS.txt in the root of the project.
 * 
 * This source code and any derived binaries are covered by the terms and 
 * conditions of the Licence agreement ("the Licence").  You may not use this 
 * source code or any derived binaries except in compliance with the Licence.  
 * A copy of the Licence is available in the file named LICENSE.txt shipped with 
 * this source code or binaries.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import synapticloop.scaleway.api.model.Image;

/**
 * The image response object which encapsulates the image POJO
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageResponse {
	@JsonProperty("image")  private Image image;

	/**
	 * Get the image
	 * 
	 * @return the image
	 */
	public Image getImage() { return image; }
}
