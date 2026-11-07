package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22057b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22058c;

    public q(Context context, XmlResourceParser xmlResourceParser) {
        this.f22058c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22051q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f22056a = typedArrayObtainStyledAttributes.getResourceId(index, this.f22056a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22058c);
                this.f22058c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
