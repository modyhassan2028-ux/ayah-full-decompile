package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f14857p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public b f14858q0;

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(l(), this.f14857p0));
        throw null;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f14857p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14858q0);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.f16166w;
        }
        this.f14857p0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14858q0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
