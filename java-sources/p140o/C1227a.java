package p140o;

import C1.a;
import I1.AbstractC0245c;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1227a implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f20076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f20077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f20078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f20079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f20081f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f20082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f20083i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f20084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f20085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f20086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20089p;

    @Override // C1.a
    public final AbstractC0245c a() {
        return null;
    }

    @Override // C1.a
    public final a b(AbstractC0245c abstractC0245c) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f20082h;
        if (drawable != null) {
            if (this.f20087n || this.f20088o) {
                this.f20082h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f20082h = drawableMutate;
                if (this.f20087n) {
                    drawableMutate.setTintList(this.f20085l);
                }
                if (this.f20088o) {
                    this.f20082h.setTintMode(this.f20086m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // C1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20081f;
    }

    @Override // C1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f20082h;
    }

    @Override // C1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20085l;
    }

    @Override // C1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20086m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20078c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // C1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20080e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20079d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f20076a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20077b;
        return charSequence != null ? charSequence : this.f20076a;
    }

    @Override // C1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20084k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f20089p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f20089p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f20089p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f20089p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f20081f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f20089p = (z10 ? 1 : 0) | (this.f20089p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f20089p = (z10 ? 2 : 0) | (this.f20089p & (-3));
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f20089p = (z10 ? 16 : 0) | (this.f20089p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20082h = drawable;
        c();
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20085l = colorStateList;
        this.f20087n = true;
        c();
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20086m = mode;
        this.f20088o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20078c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f20079d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20079d = c10;
        this.f20081f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20076a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20077b = charSequence;
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.f20084k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f20089p = (this.f20089p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f20081f = Character.toLowerCase(c10);
        this.g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f20079d = c10;
        this.f20080e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f20076a = this.f20083i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f20084k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f20082h = this.f20083i.getDrawable(i10);
        c();
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f20079d = c10;
        this.f20080e = KeyEvent.normalizeMetaState(i10);
        this.f20081f = Character.toLowerCase(c11);
        this.g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
