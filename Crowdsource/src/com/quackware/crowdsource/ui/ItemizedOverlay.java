/*******************************************************************************
 * Copyright (c) 2012 Curtis Larson (QuackWare).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package com.quackware.crowdsource.ui;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;

import com.google.android.maps.OverlayItem;

public class ItemizedOverlay extends com.google.android.maps.ItemizedOverlay {

	private ArrayList<OverlayItem> _overlays = new ArrayList<OverlayItem>();

	public ItemizedOverlay(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected OverlayItem createItem(int i) {
		return _overlays.get(i);
	}

	@Override
	public int size() {
		return _overlays.size();
	}

	public void addOverlay(OverlayItem item) {
		_overlays.add(item);
		populate();
	}

}
