package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ayah.R;
import p073h.a;
import p074h0.i;
import p140o.k;
import p140o.m;
import p140o.x;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements x, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Drawable f11402A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f11403B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Context f11404C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f11405D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Drawable f11406E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f11407F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LayoutInflater f11408G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f11409H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f11410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f11411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RadioButton f11412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f11413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CheckBox f11414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f11415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f11416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f11417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f11418z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f11408G == null) {
            this.f11408G = LayoutInflater.from(getContext());
        }
        return this.f11408G;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f11416x;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // p140o.x
    public final void a(m mVar) {
        this.f11410r = mVar;
        boolean zIsVisible = mVar.isVisible();
        k kVar = mVar.f20173n;
        boolean z10 = false;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(mVar.f20166e);
        setCheckable(mVar.isCheckable());
        if (kVar.o()) {
            if ((kVar.n() ? mVar.j : mVar.f20168h) != 0) {
                z10 = true;
            }
        }
        setShortcut(z10, kVar.n() ? mVar.j : mVar.f20168h);
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
        setSubMenuArrowVisible(mVar.hasSubMenu());
        setContentDescription(mVar.f20176q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f11417y;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11417y.getLayoutParams();
        rect.top = this.f11417y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p140o.x
    public m getItemData() {
        return this.f11410r;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f11402A);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f11413u = textView;
        int i10 = this.f11403B;
        if (i10 != -1) {
            textView.setTextAppearance(this.f11404C, i10);
        }
        this.f11415w = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f11416x = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f11406E);
        }
        this.f11417y = (ImageView) findViewById(R.id.group_divider);
        this.f11418z = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f11411s != null && this.f11405D) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f11411s.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f11412t == null && this.f11414v == null) {
            return;
        }
        if ((this.f11410r.f20183x & 4) != 0) {
            if (this.f11412t == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f11412t = radioButton;
                LinearLayout linearLayout = this.f11418z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f11412t;
            view = this.f11414v;
        } else {
            if (this.f11414v == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f11414v = checkBox;
                LinearLayout linearLayout2 = this.f11418z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f11414v;
            view = this.f11412t;
        }
        if (z10) {
            compoundButton.setChecked(this.f11410r.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f11414v;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f11412t;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f11410r.f20183x & 4) != 0) {
            if (this.f11412t == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f11412t = radioButton;
                LinearLayout linearLayout = this.f11418z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f11412t;
        } else {
            if (this.f11414v == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f11414v = checkBox;
                LinearLayout linearLayout2 = this.f11418z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f11414v;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f11409H = z10;
        this.f11405D = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f11417y;
        if (imageView != null) {
            imageView.setVisibility((this.f11407F || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        k kVar = this.f11410r.f20173n;
        boolean z10 = this.f11409H;
        if (z10 || this.f11405D) {
            ImageView imageView = this.f11411s;
            if (imageView == null && drawable == null && !this.f11405D) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f11411s = imageView2;
                LinearLayout linearLayout = this.f11418z;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f11405D) {
                this.f11411s.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f11411s;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f11411s.getVisibility() != 0) {
                this.f11411s.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    public void setShortcut(boolean z10, char c10) {
        int i10;
        String string;
        boolean z11;
        if (z10) {
            m mVar = this.f11410r;
            k kVar = mVar.f20173n;
            if (kVar.o()) {
                if ((kVar.n() ? mVar.j : mVar.f20168h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            i10 = z11 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.f11415w;
            m mVar2 = this.f11410r;
            k kVar2 = mVar2.f20173n;
            Context context = kVar2.f20134a;
            char c11 = kVar2.n() ? mVar2.j : mVar2.f20168h;
            if (c11 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = kVar2.n() ? mVar2.f20170k : mVar2.f20169i;
                m.c(sb, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                m.c(sb, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                m.c(sb, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                m.c(sb, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                m.c(sb, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                m.c(sb, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c11 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c11 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c11 != ' ') {
                    sb.append(c11);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f11415w.getVisibility() != i10) {
            this.f11415w.setVisibility(i10);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f11413u.getVisibility() != 8) {
                this.f11413u.setVisibility(8);
            }
        } else {
            this.f11413u.setText(charSequence);
            if (this.f11413u.getVisibility() != 0) {
                this.f11413u.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        i iVarB = i.B(getContext(), attributeSet, a.f16397t, i10);
        this.f11402A = iVarB.r(5);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        this.f11403B = typedArray.getResourceId(1, -1);
        this.f11405D = typedArray.getBoolean(7, false);
        this.f11404C = context;
        this.f11406E = iVarB.r(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f11407F = typedArrayObtainStyledAttributes.hasValue(0);
        iVarB.C();
        typedArrayObtainStyledAttributes.recycle();
    }
}
