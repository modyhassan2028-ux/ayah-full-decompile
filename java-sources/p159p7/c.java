package p159p7;

import H7.H;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.ayah.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p128m7.a;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21041b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f21044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f21045f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f21046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21047i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21048k;

    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        b bVar2 = bVar == null ? new b() : bVar;
        int i10 = bVar2.f21031r;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayM = H.m(context, attributeSet, a.f19658c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f21042c = typedArrayM.getDimensionPixelSize(4, -1);
        this.f21047i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f21043d = typedArrayM.getDimensionPixelSize(14, -1);
        this.f21044e = typedArrayM.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayM.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f21045f = typedArrayM.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f21046h = typedArrayM.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f21048k = typedArrayM.getInt(24, 1);
        b bVar3 = this.f21041b;
        int i11 = bVar2.f21039z;
        bVar3.f21039z = i11 == -2 ? 255 : i11;
        int i12 = bVar2.f21016B;
        if (i12 != -2) {
            bVar3.f21016B = i12;
        } else if (typedArrayM.hasValue(23)) {
            this.f21041b.f21016B = typedArrayM.getInt(23, 0);
        } else {
            this.f21041b.f21016B = -1;
        }
        String str = bVar2.f21015A;
        if (str != null) {
            this.f21041b.f21015A = str;
        } else if (typedArrayM.hasValue(7)) {
            this.f21041b.f21015A = typedArrayM.getString(7);
        }
        b bVar4 = this.f21041b;
        bVar4.f21020F = bVar2.f21020F;
        CharSequence charSequence = bVar2.f21021G;
        bVar4.f21021G = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f21041b;
        int i13 = bVar2.f21022H;
        bVar5.f21022H = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = bVar2.f21023I;
        bVar5.f21023I = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = bVar2.f21025K;
        bVar5.f21025K = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f21041b;
        int i15 = bVar2.f21017C;
        bVar6.f21017C = i15 == -2 ? typedArrayM.getInt(21, -2) : i15;
        b bVar7 = this.f21041b;
        int i16 = bVar2.f21018D;
        bVar7.f21018D = i16 == -2 ? typedArrayM.getInt(22, -2) : i16;
        b bVar8 = this.f21041b;
        Integer num = bVar2.f21035v;
        bVar8.f21035v = Integer.valueOf(num == null ? typedArrayM.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar9 = this.f21041b;
        Integer num2 = bVar2.f21036w;
        bVar9.f21036w = Integer.valueOf(num2 == null ? typedArrayM.getResourceId(6, 0) : num2.intValue());
        b bVar10 = this.f21041b;
        Integer num3 = bVar2.f21037x;
        bVar10.f21037x = Integer.valueOf(num3 == null ? typedArrayM.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar11 = this.f21041b;
        Integer num4 = bVar2.f21038y;
        bVar11.f21038y = Integer.valueOf(num4 == null ? typedArrayM.getResourceId(16, 0) : num4.intValue());
        b bVar12 = this.f21041b;
        Integer num5 = bVar2.f21032s;
        bVar12.f21032s = Integer.valueOf(num5 == null ? g.w(context, typedArrayM, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f21041b;
        Integer num6 = bVar2.f21034u;
        bVar13.f21034u = Integer.valueOf(num6 == null ? typedArrayM.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar2.f21033t;
        if (num7 != null) {
            this.f21041b.f21033t = num7;
        } else if (typedArrayM.hasValue(9)) {
            this.f21041b.f21033t = Integer.valueOf(g.w(context, typedArrayM, 9).getDefaultColor());
        } else {
            int iIntValue = this.f21041b.f21034u.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, a.f19663e0);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListW = g.w(context, typedArrayObtainStyledAttributes, 3);
            g.w(context, typedArrayObtainStyledAttributes, 4);
            g.w(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i17 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i17, 0);
            typedArrayObtainStyledAttributes.getString(i17);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            g.w(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, a.f19642J);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f21041b.f21033t = Integer.valueOf(colorStateListW.getDefaultColor());
        }
        b bVar14 = this.f21041b;
        Integer num8 = bVar2.f21024J;
        bVar14.f21024J = Integer.valueOf(num8 == null ? typedArrayM.getInt(2, 8388661) : num8.intValue());
        b bVar15 = this.f21041b;
        Integer num9 = bVar2.f21026L;
        bVar15.f21026L = Integer.valueOf(num9 == null ? typedArrayM.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar16 = this.f21041b;
        Integer num10 = bVar2.f21027M;
        bVar16.f21027M = Integer.valueOf(num10 == null ? typedArrayM.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar17 = this.f21041b;
        Integer num11 = bVar2.f21028N;
        bVar17.f21028N = Integer.valueOf(num11 == null ? typedArrayM.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar18 = this.f21041b;
        Integer num12 = bVar2.f21029O;
        bVar18.f21029O = Integer.valueOf(num12 == null ? typedArrayM.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar19 = this.f21041b;
        Integer num13 = bVar2.f21030P;
        bVar19.f21030P = Integer.valueOf(num13 == null ? typedArrayM.getDimensionPixelOffset(19, bVar19.f21028N.intValue()) : num13.intValue());
        b bVar20 = this.f21041b;
        Integer num14 = bVar2.Q;
        bVar20.Q = Integer.valueOf(num14 == null ? typedArrayM.getDimensionPixelOffset(26, bVar20.f21029O.intValue()) : num14.intValue());
        b bVar21 = this.f21041b;
        Integer num15 = bVar2.T;
        bVar21.T = Integer.valueOf(num15 == null ? typedArrayM.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar22 = this.f21041b;
        Integer num16 = bVar2.R;
        bVar22.R = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar23 = this.f21041b;
        Integer num17 = bVar2.S;
        bVar23.S = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar24 = this.f21041b;
        Boolean bool2 = bVar2.U;
        bVar24.U = Boolean.valueOf(bool2 == null ? typedArrayM.getBoolean(0, false) : bool2.booleanValue());
        typedArrayM.recycle();
        Locale locale = bVar2.f21019E;
        if (locale == null) {
            this.f21041b.f21019E = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f21041b.f21019E = locale;
        }
        this.f21040a = bVar2;
    }
}
