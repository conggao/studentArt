package com.gk.util;


public class ExcelUtils
{

//    public void createOrderExcel(OutputStream os, List<ViewOrderInfo> list) throws WriteException,IOException
//    {
//        //����������
//        WritableWorkbook workbook = Workbook.createWorkbook(os);
//        //�����µ�һҳ
//        WritableSheet sheet = workbook.createSheet("First Sheet",0);
//        
//        Label label;
//        
//        //����Ҫ��ʾ������,����һ����Ԫ�񣬵�һ������Ϊ�����꣬�ڶ�������Ϊ�����꣬����������Ϊ����
//        label = new Label(0, 0, "���");
//        sheet.addCell(label);
//        label = new Label(1, 0, "������");
//        sheet.addCell(label);
//        label = new Label(2, 0, "��Ʒ����");
//        sheet.addCell(label);
//        label = new Label(3, 0, "����ͺ�");
//        sheet.addCell(label);
//        label = new Label(4, 0, "�������");
//        sheet.addCell(label);
//        label = new Label(5, 0, "��������");
//        sheet.addCell(label);
//        label = new Label(6, 0, "�ͻ����");
//        sheet.addCell(label);
//        label = new Label(7, 0, "ҵ��Ա");
//        sheet.addCell(label);
//        label = new Label(8, 0, "���۲���");
//        sheet.addCell(label);
//        label = new Label(9, 0, "��������");
//        sheet.addCell(label);
//        label = new Label(10, 0, "��������");
//        sheet.addCell(label);
//        label = new Label(11, 0, "Ԥ������");
//        sheet.addCell(label);
//        label = new Label(12, 0, "״̬");
//        sheet.addCell(label);
//        label = new Label(13, 0, "��ע");
//        sheet.addCell(label);
//        
//        int pos = 0;
//        if (null != list)
//        {
//	        for (int i = 0; i < list.size(); i++)
//	        {        	
//	        	ViewOrderInfo obj = list.get(i);
//	        	if (null == obj)
//	        	{
//	        		continue;
//	        	}
//	        	pos++;
//
//	            label = new Label(0, pos, String.valueOf(pos));
//	            sheet.addCell(label);
//	        	
//	        	label = new Label(1, pos, obj.getOrderNo());
//		        sheet.addCell(label);
//	            label = new Label(2, pos, obj.getInvName());
//	            sheet.addCell(label);
//	            label = new Label(3, pos, obj.getInvStd());
//	            sheet.addCell(label);
//	            label = new Label(4, pos, obj.getInvCode());
//	            sheet.addCell(label);
//	            label = new Label(5, pos, obj.getIquantity().toString());
//	            sheet.addCell(label);	            
//	            label = new Label(6, pos, obj.getCustomName());
//	            sheet.addCell(label); 	            
//	            label = new Label(7, pos, obj.getSalesname());
//	            sheet.addCell(label); 	
//	            label = new Label(8, pos, obj.getDepartment());
//	            sheet.addCell(label); 	
//	            label = new Label(9, pos, obj.getSaleType());
//	            sheet.addCell(label); 	
//	            label = new Label(10, pos, obj.getOrderDate().toString());
//	            sheet.addCell(label); 
//                label = new Label(11, pos, obj.getPreDate().toString());
//	            sheet.addCell(label); 	
//	            label = new Label(12, pos, obj.getStatusDesc());
//	            sheet.addCell(label); 	
//	            label = new Label(13, pos, obj.getRemark());
//	            sheet.addCell(label); 	
//	        }
//        }
//        
//        //�Ѵ���������д�뵽������У����ر������
//        workbook.write();
//        workbook.close();
//        os.close();
//    }
//    
//	
}
