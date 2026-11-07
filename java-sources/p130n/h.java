package p130n;

import I1.AbstractC0245c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p073h.a;
import p074h0.i;
import p140o.k;
import p140o.n;
import p151p.AbstractC1249j0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f19772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f19773f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f19774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f19776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f19777d;

    static {
        Class[] clsArr = {Context.class};
        f19772e = clsArr;
        f19773f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f19776c = context;
        Object[] objArr = {context};
        this.f19774a = objArr;
        this.f19775b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        ColorStateList colorStateList;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z11) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f19776c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16395r);
                        gVar.f19749b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f19750c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f19751d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f19752e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f19753f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        gVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        i iVarA = i.A(context, attributeSet, a.f16396s);
                        TypedArray typedArray = (TypedArray) iVarA.f16423t;
                        gVar.f19755i = typedArray.getResourceId(2, 0);
                        gVar.j = (typedArray.getInt(5, gVar.f19750c) & (-65536)) | (typedArray.getInt(6, gVar.f19751d) & 65535);
                        gVar.f19756k = typedArray.getText(7);
                        gVar.f19757l = typedArray.getText(8);
                        gVar.f19758m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        gVar.f19759n = string == null ? (char) 0 : string.charAt(0);
                        gVar.f19760o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        gVar.f19761p = string2 == null ? (char) 0 : string2.charAt(0);
                        gVar.f19762q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            gVar.f19763r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            gVar.f19763r = gVar.f19752e;
                        }
                        gVar.f19764s = typedArray.getBoolean(3, false);
                        gVar.f19765t = typedArray.getBoolean(4, gVar.f19753f);
                        gVar.f19766u = typedArray.getBoolean(1, gVar.g);
                        gVar.f19767v = typedArray.getInt(21, -1);
                        gVar.f19770y = typedArray.getString(12);
                        gVar.f19768w = typedArray.getResourceId(13, 0);
                        gVar.f19769x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        boolean z12 = string3 != null;
                        if (z12 && gVar.f19768w == 0 && gVar.f19769x == null) {
                            gVar.f19771z = (AbstractC0245c) gVar.a(string3, f19773f, this.f19775b);
                        } else {
                            if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            gVar.f19771z = null;
                        }
                        gVar.f19743A = typedArray.getText(17);
                        gVar.f19744B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            gVar.f19746D = AbstractC1249j0.c(typedArray.getInt(19, -1), gVar.f19746D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            gVar.f19746D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            gVar.f19745C = iVarA.q(18);
                        } else {
                            gVar.f19745C = colorStateList;
                        }
                        iVarA.C();
                        gVar.f19754h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        gVar.f19754h = true;
                        SubMenu subMenuAddSubMenu = gVar.f19748a.addSubMenu(gVar.f19749b, gVar.f19755i, gVar.j, gVar.f19756k);
                        gVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z11 = true;
                    }
                }
                z10 = z10;
            } else if (eventType != 3) {
                z10 = z10;
            } else {
                String name3 = xmlPullParser.getName();
                if (z11 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z11 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        gVar.f19749b = 0;
                        gVar.f19750c = 0;
                        gVar.f19751d = 0;
                        gVar.f19752e = 0;
                        gVar.f19753f = true;
                        gVar.g = true;
                    } else if (name3.equals("item")) {
                        if (!gVar.f19754h) {
                            AbstractC0245c abstractC0245c = gVar.f19771z;
                            if (abstractC0245c == null || !((n) abstractC0245c).f20187c.hasSubMenu()) {
                                gVar.f19754h = true;
                                gVar.b(gVar.f19748a.add(gVar.f19749b, gVar.f19755i, gVar.j, gVar.f19756k));
                            } else {
                                gVar.f19754h = true;
                                gVar.b(gVar.f19748a.addSubMenu(gVar.f19749b, gVar.f19755i, gVar.j, gVar.f19756k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z10 = true;
                    }
                    z10 = z10;
                }
            }
            eventType = xmlPullParser.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof k)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f19776c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof k) {
                    k kVar = (k) menu;
                    if (!kVar.f20147p) {
                        kVar.y();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((k) menu).x();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((k) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
