/*******************************************************************************
 * Copyright (c) 2018 Composent, Inc. and others. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Composent, Inc. - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.tcpsocket.common;

import java.net.URI;
import java.util.UUID;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.identity.URIID.URIIDNamespace;

public class TCPSocketNamespace extends URIIDNamespace {

	private static final long serialVersionUID = -5791754765760376711L;
	public static TCPSocketNamespace INSTANCE;

	public TCPSocketNamespace() {
		super(TCPSocketConstants.NAMESPACE_NAME, "TCP SocketNamespace");
		INSTANCE = this;
	}

	public static TCPSocketNamespace getInstance() {
		return INSTANCE;
	}

	public String getScheme() {
		return "tcp";
	}

	public static ID createServerID(URI uri) {
		return getInstance().createInstance(new Object[] { uri });
	}
	
	public static ID createClientID() {
		return getInstance().createInstance(new Object[] { "uuid:" + UUID.randomUUID().toString() });
	}
}
