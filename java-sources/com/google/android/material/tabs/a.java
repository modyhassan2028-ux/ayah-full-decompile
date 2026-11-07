package com.google.android.material.tabs;

import H7.H;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f15219V || !(view instanceof TabLayout.TabView)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iG = (int) H.g(tabView.getContext(), 24);
        if (contentWidth < iG) {
            contentWidth = iG;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(p137n7.a.c((int) rectFA.left, f3, (int) rectFA2.left), drawable.getBounds().top, p137n7.a.c((int) rectFA.right, f3, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
