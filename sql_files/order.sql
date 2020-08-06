USE [Supermarket]
GO

/****** Object:  Table [dbo].[Order]    Script Date: 8/1/2020 12:30:31 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Order]') AND type in (N'U'))
DROP TABLE [dbo].[Order]
GO

/****** Object:  Table [dbo].[Order]    Script Date: 8/1/2020 12:30:31 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[order](
	[order_id] [int] identity(1,1)NOT NULL,
	[orderDate] [date] NOT NULL,
	[orderAmount] [float] NOT NULL,
	[billingAddress] [varchar](50) NOT NULL,
	[product_id] [int] NOT NULL,
	[customer_id] [int] NOT NULL,
	[shoppingCart_id] [int] NULL,
	[status] [varchar](20) NOT NULL,
	[deliveryDate] [date] NOT NULL,
	[createdat] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[Order_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


