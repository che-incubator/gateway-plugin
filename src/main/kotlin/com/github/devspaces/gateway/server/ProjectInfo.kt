/*
 * Copyright (c) 2024 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */

package com.github.devspaces.gateway.server

data class ProjectInfo(
    val projectName: String,
    val projectPath: String,
    val joinLink: String,
    val httpLink: String,
    val gatewayLink: String,
)

